public class ListSum {
    public int sum(ListNode list, int thresh) {
        int total = 0;
        if (list == null) {
            return 0;
        }
        while (list != null) {
            if (list.info > thresh) {
                System.out.println(list.info);
                total += list.info;
            }
            list = list.next;
        }
        System.out.println("- - METHOD END - -");
        return total;
    }
}
