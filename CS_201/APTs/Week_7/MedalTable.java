public class MedalTable {
    public String[] generate(String[] results) {
       // you fill in this code
    }
    private class MedalCountry{
        String myName;
        int myGold;
        int mySilver;
        int myBronze;
        MedalCountry(String name) {
            myName = name;
        }
        public int getGold(){
            return myGold;
        }
        public int getSilver(){
            return mySilver;
        }
        public int getBronze(){
            return myBronze;
        }
        public String getName(){
            return myName;
        }
        @Override
        public String toString(){
            return String.format("%s %d %d %d", myName, myGold, mySilver, myBronze);
        }
    }
}