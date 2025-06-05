package model;

import java.sql.*;
import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class UsuarioDAO extends GenericDAO {

    public void salvar(Usuario usuario) throws SQLException {
        String insert = "INSERT INTO USUARIOS(nome, fone, login, senha, perfil, data, email) VALUES(?,?,?,?,?,?,?)";
        save(insert,
                usuario.getNome(),
                usuario.getFone(),
                usuario.getLogin(),
                usuario.getSenha(),
                usuario.getPerfil(),
                Date.valueOf(usuario.getData()),
                usuario.getEmail());
    }

    public void alterar(Usuario usuario) throws SQLException {
        String update = "UPDATE USUARIOS SET nome = ?, fone = ?, login = ?, senha = ?, perfil = ?, data = ?, email = ? WHERE ID = ?";
        update(update,
                usuario.getNome(),
                usuario.getFone(),
                usuario.getLogin(),
                usuario.getSenha(),
                usuario.getPerfil(),
                Date.valueOf(usuario.getData()),
                usuario.getEmail(),
                usuario.getId());
    }

    public void excluir(long id) throws SQLException {
        String delete = "DELETE FROM USUARIOS WHERE ID = ?";
        delete(delete, id);
    }

    public ObservableList<Usuario> selecionarUsuarios() throws SQLException {
        ObservableList<Usuario> lista = FXCollections.observableArrayList();
        String sql = "SELECT * FROM USUARIOS";
        PreparedStatement pstm = conectarDAO().prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            Usuario usuario = new Usuario();
            usuario.setId(rs.getInt("id"));
            usuario.setNome(rs.getString("nome"));
            usuario.setFone(rs.getString("fone"));
            usuario.setLogin(rs.getString("login"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setPerfil(rs.getString("perfil"));
            usuario.setData(rs.getDate("data").toLocalDate());
            usuario.setEmail(rs.getString("email"));

            lista.add(usuario);
        }

        rs.close();
        pstm.close();
        conectarDAO().close();

        return lista;
    }

    public Usuario selecionarUsuario(Long iduser) throws SQLException {
        Usuario usuario = new Usuario();
        String sql = "SELECT * FROM USUARIOS WHERE ID = ?";
        PreparedStatement pstm = conectarDAO().prepareStatement(sql);
        pstm.setLong(1, iduser);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            usuario.setId(rs.getInt("id"));
            usuario.setNome(rs.getString("nome"));
            usuario.setFone(rs.getString("fone"));
            usuario.setLogin(rs.getString("login"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setPerfil(rs.getString("perfil"));
            usuario.setData(rs.getDate("data").toLocalDate());
            usuario.setEmail(rs.getString("email"));
        }

        rs.close();
        pstm.close();
        conectarDAO().close();

        return usuario;
    }
}
