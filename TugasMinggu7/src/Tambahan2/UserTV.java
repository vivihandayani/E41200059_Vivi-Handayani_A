package Tambahan2;

public class UserTV {
    public static void main(String[] args) {
        tvModern tv = new tvModern("TV Sharp, 32 inces", 100);

        String[] semuaChannel = {"TRANS 7", "TRANS TV", "NET", "ANTV",
            "RCTI", "INDOSIAR", "MNCTV", "GLOBAL TV","SCTV", "TVONE", "METRO TV"};

        System.out.println("Vivi, membeli Televisi : " + tv.getDesk());

        tv.getChannels();
        tv.setChannels(semuaChannel);

        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);

        tv.setModusTampilan(tvModern.TELETEXT);
        tv.setHalamanTeleText(250);
        tv.setModusTampilan(tvModern.tV);
        tv.playCD();
        tv.setDiscTray("Harry Potter");
        tv.playCD();
    }
}
