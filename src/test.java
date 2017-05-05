/**
 * Created by Rackenrotz on 14.01.16.
 */
public class test {


    public static void main(String[] args) {





        Node a = new Node(1);
        Node b = a;
        b.next = new Node(2);
        IntList x = new IntList(b);

        for (Node start = x.getHead(); start != null; start = start.getNext()) {
            System.out.print(start.getValue() + " ");
        }

        System.out.println("");


        a = new Node(3);
        IntList y = new IntList(a);


        System.out.println("");

        for (Node start = y.getHead(); start != null; start = start.getNext()) {
            System.out.print(start.getValue() + " ");
        }

        System.out.println("");
        a.next = x.getHead().next;
        b.next = a;

        for (Node start = x.getHead(); start != null; start = start.getNext()) {
            System.out.print(start.getValue() + " ");
        }

        System.out.println("");

        for (Node start = y.getHead(); start != null; start = start.getNext()) {
            System.out.print(start.getValue() + " ");
        }


        System.out.println("");
        System.out.println("");



        System.out.println("");

/*
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(6);
        Node f = new Node(8);
        Node g = new Node(7);
        Node h = new Node(11);
        Node i = new Node(130);
        Node j = new Node(54);
        Node k = new Node(55);

        Node l = new Node((int) (Math.random() * 40) + 40);
        Node m = new Node((int) (Math.random() * 40) + 40);
        Node n = new Node((int) (Math.random() * 40) + 40);
        Node o = new Node((int) (Math.random() * 40) + 40);
        Node p = new Node((int) (Math.random() * 40) + 40);
        Node q = new Node((int) (Math.random() * 40) + 40);
        Node r = new Node((int) (Math.random() * 40) + 40);
        Node s = new Node((int) (Math.random() * 40) + 40);
        Node t = new Node((int) (Math.random() * 40) + 40);

        IntList x = new IntList(l);
        IntList y = new IntList(a);

        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);
        e.setNext(f);
        f.setNext(g);
        g.setNext(h);
        h.setNext(i);
        i.setNext(j);
        j.setNext(k);

        l.setNext(m);
        m.setNext(n);
        n.setNext(o);
        o.setNext(p);
        p.setNext(q);
        q.setNext(r);
        r.setNext(s);
        s.setNext(t);

        x.appendPart(x,y,2);


*/

    }
}
