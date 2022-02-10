class MainClass{

    public static void main (String[]args)
    {
        SList sl=new SList();
        SListIterator sli=sl.iterateOverList();
        System.out.print(sl);
        sli.insert("hello");
        sli.insert("hi");
        System.out.println(sl);
        SListIterator obj3=sl.iterateOverList();
        obj3.remove();
        System.out.println(sl);

    }
}
class Node
        {
            String data;
            Node next;
            Node  (String data,Node next)
            {
                this.data=data;
                this.next=next;
            }
            Node(String data){
                this(data, null);
            }
            public String toString()
            {
                if(data==null)
                    return "null";
                return data;
            }
        }

        class SList
        {
            Node head=new Node(null);
            public SListIterator iterateOverList()
            {
                return new SListIterator(head);
            }
            public String toString()
            {
                if(head==null){
                return "list is empty:";
            }
            SListIterator iterator=this.iterateOverList();
            StringBuilder sb=new StringBuilder();
            while(iterator.hasNext())
            {
                sb.append(iterator.next()+(iterator.hasNext() ? ", " : ""));
            }
            return ""+sb;
            }
        }

        class SListIterator
        {
            Node temporary;
            SListIterator(Node node)
            {
                this.temporary=node;
            }
            public Node next()
            {
                temporary=temporary.next;
                return temporary;
           }
            public boolean hasNext()
            {
                return temporary.next!=null;
            }
            public void insert(String data)
            {
                temporary.next=new Node(data, temporary.next);
                temporary=temporary.next;
            }
            public void remove()
            {
                if(temporary.next!=null)
                {
                    temporary.next=temporary.next.next;
                }
            }
        }

