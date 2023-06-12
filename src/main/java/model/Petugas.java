package model;
public class Petugas {
    private int id;
    private String nama_petugas;
    private String username;
    private String password;

    public Petugas() {
    }

    
    
    public Petugas(int id, String nama_petugas, String username, String password) {
        this.id = id;
        this.nama_petugas = nama_petugas;
        this.username = username;
        this.password = password;
    }

    public Petugas(int id, String nama_petugas) {
        this.id = id;
        this.nama_petugas = nama_petugas;
    }
    
    

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_petugas() {
        return nama_petugas;
    }

    public void setNama_petugas(String nama_petugas) {
        this.nama_petugas = nama_petugas;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
