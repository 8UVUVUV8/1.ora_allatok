public class App {
    public static void main(String[] args) throws Exception {
        Maci maci = new Maci();
        Macska mici = new Macska();
        Pingvin pingu = new Pingvin();

        //*****************/


        maci.nevBealit("Brumi");
        System.out.println(maci.nevVisszaAd);
        maci.mezgyujtes();
        maci.hangotad("Brummm......");

        System.out.println("_____________________________");
        //-----------------------------------------------------------------


        //mici.nev = "Mici";
        //System.out.println(mici.nev);
        mici.hangotad("Nyauuuuu.....");
        mici.dorombol();

        System.out.println("_____________________________");
        //-------------------------------------------------------------------


        //pingu.nev = "Pingu";
        //System.out.println(pingu.nev);
        pingu.mitcsinál();
        pingu.hangotad("Kvákk.......");
    }
}
