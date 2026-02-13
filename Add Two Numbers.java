class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2!=null) return l2;
        if(l2==null && l1!=null) return l1;
        if(l1==null && l2==null) return null;

        int carry=0;
        ListNode ans=new ListNode(1);
        ListNode res=ans;
        ListNode temp1=l1;
        ListNode temp2=l2;

        while(temp1!=null && temp2!=null){
        int sum=temp1.val + temp2.val+carry;
        carry=sum/10;
        int val=sum%10;
        ans.next=new ListNode(val);
        ans=ans.next;
        temp1=temp1.next;
        temp2=temp2.next;
        }

        while(temp1!=null){
        int sum=temp1.val + carry;
        carry=sum/10;
        int val=sum%10;
        ans.next=new ListNode(val);
        ans=ans.next;
        temp1=temp1.next;
        }

        while(temp2!=null){
        int sum=temp2.val+carry;
        carry=sum/10;
        int val=sum%10;
        ans.next=new ListNode(val);
        ans=ans.next;
        temp2=temp2.next;
        }

        while(carry!=0){
            int val=carry%10;
            ans.next=new ListNode(val);
            ans=ans.next;
            carry/=10;
        }

        return res.next;
    }
}