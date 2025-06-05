package model;

import java.io.Serializable;
import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Usuario implements Serializable {

    private int id;
    private String nome;
    private String fone;
    private String login;
    private String senha;
    private String perfil;
    private LocalDate data;
    private String email;
    

    // Método construtor com todos os parâmetros
    public Usuario(int id, String nome, String fone, String login, String senha, String perfil, LocalDate data, String email) {
        this.id = id;
        this.nome = nome;
        this.fone = fone;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
        this.data = data;
        this.email = email;
        
        
    }

    // Método construtor com todos os parâmetros menos ID
    public Usuario(String nome,  String fone, String login, String senha, String perfil, LocalDate data, String email) {
        this.nome = nome;
        this.data = data; 
        this.email = email;
        this.fone = fone;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    // Método construtor para o login
    public Usuario(String login, String senha, String perfil) {
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public Usuario() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public  String getEmail (){
        return email;
    }
    public void setEmail (String email){
        this.email = email;
    }
    public LocalDate getData (){
        return data;
    }
    public void setData(LocalDate data){
    this.data = data ;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    private transient IntegerProperty idProperty;

    public IntegerProperty idProperty() {
        if (idProperty == null) {
            idProperty = new SimpleIntegerProperty(id);
        }
        return idProperty;
    }
    
    private transient StringProperty emailProperty;
    
    public StringProperty emailProperty() {
        if (emailProperty == null) {
            emailProperty = new SimpleStringProperty(email);
        }
        return emailProperty;
    }
    
    private transient ObjectProperty<LocalDate> dataProperty;

public ObjectProperty<LocalDate> dataProperty() {
    if (dataProperty == null) {
        dataProperty = new SimpleObjectProperty<>(data);
    }
    return dataProperty;
}
    
    private transient StringProperty nomeProperty;

    public StringProperty nomeProperty() {
        if (nomeProperty == null) {
            nomeProperty = new SimpleStringProperty(nome);
        }
        return nomeProperty;
    }

    private transient StringProperty foneProperty;

    public StringProperty foneProperty() {
        if (foneProperty == null) {
            foneProperty = new SimpleStringProperty(fone);
        }
        return foneProperty;
    }

    private transient StringProperty loginProperty;

    public StringProperty loginProperty() {
        if (loginProperty == null) {
            loginProperty = new SimpleStringProperty(login);
        }
        return loginProperty;
    }

    private transient StringProperty senhaProperty;

    public StringProperty senhaProperty() {
        if (senhaProperty == null) {
            senhaProperty = new SimpleStringProperty(senha);
        }
        return senhaProperty;
    }

    private transient StringProperty perfilProperty;

    public StringProperty perfilProperty() {
        if (perfilProperty == null) {
            perfilProperty = new SimpleStringProperty(perfil);
        }
        return perfilProperty;
    }
    
    

}
