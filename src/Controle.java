public class Controle {



    private String modelo;

    private static Controle instance = new Controle();

    private Controle() {}
    public static Controle getInstance() {
        return instance;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String trocaCanal(Integer canal) throws Exception {
        if (modelo != null) {
            return "Canal " + canal;
        } else {
            throw new Exception("Nenhum dispositivo está definido para o controle remoto");
        }
    }

    public Integer alterarVolume(Integer volume) throws Exception {
        if (modelo != null) {
            return volume;
        } else {
            throw new Exception("Nenhum dispositivo está definido para o controle remoto");
        }
    }
}
