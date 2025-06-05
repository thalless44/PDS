package controller;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Usuario;
import model.UsuarioDAO;
import util.AlertaUtil;

public class CadastroUsuariosController {

    Stage stageCadastroUsuarios;
    Usuario usuarioSelecionado;
    private Runnable onUsuarioSalvo; // Callback

    @FXML
    private Button btnExcluir;

    @FXML
    private Button btnFechar;

    @FXML
    private Button btnIncluirAlterar;

    @FXML
    private ComboBox<String> cbPerfil;

    @FXML
    private DatePicker dData;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtNome;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private TextField txtTelefone;

  
    @FXML
    void btnExcluirClick(ActionEvent event) throws SQLException {
        Optional<ButtonType> resultado = AlertaUtil.mostrarConfirmacao("Atenção",
                "Tem certeza que quer excluir o registro?");
        if (resultado.isPresent()) {
            ButtonType botaoPressionado = resultado.get();
            if (botaoPressionado == ButtonType.OK) {
                excluir(usuarioSelecionado.getId());
            }
        }
    }

    
    @FXML
    void btnFecharClick(ActionEvent event) {
        stageCadastroUsuarios.close();
    }

    
    @FXML
    void btnIncluirAlterarClick(ActionEvent event) throws SQLException {
        LocalDate data = dData.getValue();
        String email = txtEmail.getText();

        if (usuarioSelecionado == null) {
            if(!txtNome.getText().isEmpty()||
                    !txtTelefone.getText().isEmpty()||
                    !txtLogin.getText().isEmpty()||
                    !txtSenha.getText().isEmpty()||
                    !cbPerfil.getValue().isEmpty()||
                    dData.getValue() != null||
                    !txtEmail.getText().isEmpty()){
            
                incluir(txtNome.getText(),
                    txtTelefone.getText(),
                    txtLogin.getText(),
                    txtSenha.getText(),
                    cbPerfil.getValue(),
                    data,
                    email);
            
            }
            
        } else {
            
            if(!txtNome.getText().isEmpty()||
                    !txtTelefone.getText().isEmpty()||
                    !txtLogin.getText().isEmpty()||
                    !txtSenha.getText().isEmpty()||
                    !cbPerfil.getValue().isEmpty()||
                    dData.getValue() != null||
                    !txtEmail.getText().isEmpty()){
                
                alterar(usuarioSelecionado.getId(),
                    txtNome.getText(),
                    txtTelefone.getText(),
                    txtLogin.getText(),
                    txtSenha.getText(),
                    cbPerfil.getValue(),
                    data,
                    email);
            }
            
        }
    }

    
    public void setStage(Stage telaCadastroUsuarios) {
        this.stageCadastroUsuarios = telaCadastroUsuarios;
    }

  
    public void ajustarElementosJanela(Usuario user) {
        this.usuarioSelecionado = user;

        cbPerfil.getItems().setAll("admin", "user");

        if (user == null) { // Inclusão
            txtNome.requestFocus();
            btnExcluir.setVisible(false);
            btnIncluirAlterar.setText("Salvar");
        } else { // Edição
            btnIncluirAlterar.setText("Editar");
            txtNome.setText(user.getNome());
            txtTelefone.setText(user.getFone());
            txtLogin.setText(user.getLogin());
            txtSenha.setText(user.getSenha());
            txtEmail.setText(user.getEmail());
            cbPerfil.setValue(user.getPerfil());

            if (user.getData() != null) {
                dData.setValue(user.getData());
            } else {
                dData.setValue(null);
            }
        }
    }

    
    void incluir(String nome, String fone,
                 String login, String senha,
                 String perfil, LocalDate data, String email) throws SQLException {

        Usuario usuario = new Usuario(nome, fone, login, senha, perfil, data, email);
        new UsuarioDAO().salvar(usuario);

        if (onUsuarioSalvo != null) {
            onUsuarioSalvo.run();
        }

        AlertaUtil.mostrarInformacao("Informação",
                "Registro inserido com sucesso!");
        stageCadastroUsuarios.close();
    }

    
    void alterar(int id, String nome, String fone,
                 String login, String senha,
                 String perfil, LocalDate data, String email) throws SQLException {

        Usuario usuarioAlterado = new Usuario(id, nome, fone, login, senha, perfil, data, email);
        new UsuarioDAO().alterar(usuarioAlterado);

        if (onUsuarioSalvo != null) {
            onUsuarioSalvo.run();
        }

        AlertaUtil.mostrarInformacao("Informação",
                "Registro alterado com sucesso!");
        stageCadastroUsuarios.close();
    }

   
    public void excluir(int id) throws SQLException {
        new UsuarioDAO().excluir(id);

        if (onUsuarioSalvo != null) {
            onUsuarioSalvo.run();
        }

        AlertaUtil.mostrarInformacao("Informação",
                "Registro excluído com sucesso!");
        stageCadastroUsuarios.close();
    }

  
    public void setOnUsuarioSalvo(Runnable callback) {
        this.onUsuarioSalvo = callback;
    }

}
