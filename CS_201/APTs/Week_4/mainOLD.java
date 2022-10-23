public class mainOLD {
    public static void main(String[] args) {
        MemberCheck myMember = new MemberCheck();
        String[] club11 = {"JOHN","JOHN","FRED","PEG", "GEORGE"};
        String[] club21 = {"GEORGE","DAVID"};
        String[] club31 = {"GEORGE","PEG"};
        String[] output = myMember.whosDishonest(club11, club21, club31);
        for (String out : output) {
            System.out.println(out);
        }
    }
}
