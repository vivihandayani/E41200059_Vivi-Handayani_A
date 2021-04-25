package Tambahan2;

public class Televisi {
     public String deks;
    int jumlahChannel;
    private String[] channels = null;
    private int channelAktif;
    private int volume;

    public String getDesk() {
        return deks;
    }

    public int getJumlahChannel() {
        return jumlahChannel;
    }

    public String[] getChannels() {
        if (channels == null) {
            System.out.println("Channel tidak ada, silahkah atur!");
        }
        return channels;
    }

    public void setChannels(String[] channels) {
        if (channels.length > jumlahChannel) {
            System.out.println("ERROR, Tv ini hanya dapat menyimpan "
                    + jumlahChannel + " channel");
        } else {
            this.channels = channels;
            System.out.println("Informasi Channel Baru berhasil diupdate!");
        }
    }

    public int getChannelAktif() {
        return channelAktif;
    }

    public void setChannelAktif(int channelAktif) {
        if (channelAktif > channels.length) {
            System.out.println("Channel yang dicari belum diatur!");
            return;
        }
        this.channelAktif = channelAktif;
        System.out.println("Pindah Channel ke : " + channels[channelAktif]);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Intensitas volume sekarang : " + volume);
    }
}
