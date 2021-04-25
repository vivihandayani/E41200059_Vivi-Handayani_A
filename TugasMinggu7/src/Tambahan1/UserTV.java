package Tambahan1;

public class UserTV {
    public static void main(String[] args) {
        Televisi tv = new Televisi("Panasonic, 32 inches", 10);
        String[] semuaChannel = {"TRANS 7", "TRANS TV", "NET", "ANTV",
            "RCTI", "INDOSIAR", "MNCTV", "GLOBAL TV","SCTV", "TVONE", "METRO TV"};
        String[] channelFavorit = {"TRANS TV", "TRANS 7", "GLOBAL TV", "NET","RCTI", "MNCTV"};

        System.out.println("Vivi, membeli Televisi : " + tv.getDesk());

        tv.getChannels();
        tv.setChannels(semuaChannel);
        tv.setChannels(channelFavorit);

        tv.setChannelAktif(2);
        tv.setVolume(8);
        tv.setChannelAktif(5);
        tv.setChannelAktif(4);
    }

}