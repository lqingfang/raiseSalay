package lqf.raiseSalay.algorithm.ListNodeReverse;

public class ListNodeReverseTest {
    //链表反转：https://github.com/JayRichrd/ReverseList/blob/master/src/com/jy/Main.java
    public static void main(String[] args) {
        ListNode listNode8 = new ListNode(8,null);
        ListNode listNode7 = new ListNode(7,listNode8);
        ListNode listNode6 = new ListNode(6,listNode7);
        ListNode listNode5 = new ListNode(5,listNode6);
        ListNode listNode4 = new ListNode(4,listNode5);
        ListNode listNode3 = new ListNode(3,listNode4);
        ListNode listNode2 = new ListNode(2,listNode3);
        ListNode listNode1 = new ListNode(1,listNode2);
        printListNode(listNode1);
        listNode1 = reverseListByRecurisive(listNode1,null);
        //listNode1 = reverseList(listNode1);
        printListNode(listNode1);
    }

    //非递归
    private static ListNode reverseList(ListNode listNode1) {
        ListNode preListNode = null;
        ListNode nextListNode = null;
        ListNode headListNode = null;
        while (null != listNode1){
            nextListNode = listNode1.mNext;
            if(null == nextListNode) {
                headListNode = listNode1;
            }
            listNode1.mNext = preListNode;
            preListNode = listNode1;
            listNode1 = nextListNode;
        }
        return headListNode;
    }
    //递归
    private static ListNode reverseListByRecurisive(ListNode listNode1,ListNode preListNode){
        if(null == listNode1.mNext || null == listNode1) {
            listNode1.mNext = preListNode;
            return listNode1;
        }
        ListNode nextListNode = listNode1.mNext;
        listNode1.mNext = preListNode;
        preListNode = listNode1;
        listNode1 = nextListNode;
        return reverseListByRecurisive(listNode1,preListNode);
    }

    public static void printListNode(ListNode listNode) {
        while (null != listNode){
            System.out.print(listNode.mValue+" ");
            listNode = listNode.mNext;
        }
        System.out.println();
    }
}
