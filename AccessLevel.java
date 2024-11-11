public class AccessLevel {

    public String canAccess(int[] rights, int minPermission) {
        String code = "";
        for (int i : rights) {
            if (i < minPermission) {
                code += 'D';
            }
            else {
                code += 'A';
            }
        }
        return code;
    }

}