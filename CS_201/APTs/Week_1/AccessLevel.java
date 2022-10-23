public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String permissions = "";
           for(int i = 0; i < rights.length; i++) {
              if(rights[i] >= minPermission) {
                permissions += "A";
              }
              else{
                permissions += "D";
              }
           }
           return permissions;
    }
}