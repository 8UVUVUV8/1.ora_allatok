public class Allatkert {
    public void inditElet(){
        Maci maci = new Maci();
        Macska mici = new Macska();
        Pingvin pingu = new Pingvin();

        //*****************/


        maci.nevBealit("Brumi");
        System.out.println(maci.nevVisszaAd());
        maci.mezgyujtes();
        maci.hangotad("Brummm......");

        System.out.println("_____________________________");
        //-----------------------------------------------------------------


        mici.nevBealit("mici");
        System.out.println(mici.nevVisszaAd());
        mici.hangotad("Nyauuuuu.....");
        mici.dorombol();

        System.out.println("_____________________________");
        //-------------------------------------------------------------------


        pingu.nevBealit("pingu");
        System.out.println(pingu.nevVisszaAd());
        pingu.mitcsinál();
        pingu.hangotad("Kvákk.......");
    }
}
