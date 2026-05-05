class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;

        int n=1;
        ListNode temp=head;

        while(temp.next!=null){
            temp=temp.next;
            n++;
        }

        temp.next=head;
        k=k%n;
        k=n-k;

        while(k>0){
            temp=temp.next;
            k--;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}