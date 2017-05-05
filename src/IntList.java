/**
 * Created by Rackenrotz on 14.01.16.
 */
public class IntList {
    public Node head;

    // laufvariable der zu einfügeoperation dient
    private Node theohead1 = null;
    // vorstelle zu theohead1 um zwischen Operationen zu gewährleisten
    private Node theohead2 = null;
    private Node x = null;

    public IntList() {
        head = null;
    }

    public IntList(Node a) {
        this.head = a;
    }

    public void appendPart(IntList a, IntList b, int x) {

        Node check = b.head;
        Node tail = b.head.next;
        Node tailofa = a.head;

        while (tail.value != x) {
            check = check.next;
            tail = tail.next;
            if (tail.next == null) {
                break;
            }
        }

        while (tailofa.next != null) {
            tailofa = tailofa.next;
        }

        if (tail.value != x) {
            Node m = new Node(x);
            tailofa.setNext(m);
        }

        if (tail.value == x) {


            check.setNext(null);

            tailofa.setNext(tail);
        }


        for (Node start = a.getHead(); start != null; start = start.getNext()) {
            System.out.print(start.getValue() + " ");
        }
        System.out.println("");
        System.out.println("");


        for (Node start = b.getHead(); start != null; start = start.getNext()) {
            System.out.print(start.getValue() + " ");
        }
        System.out.println("");


    }


    //insertion Sort ist schnell bei wenigen Argumenten
    public void listInsert(IntList list1, IntList list2) {

        // Ist der Fall wenn die Arrayliste2 leer ist
        if (theohead1 == null && list1.getHead() != null) {

            //leere lise2 wo liste1 mehr elemente als 1 besitzt
            if (list1.getHead() != null && list1.getHead().getNext() != null) {

                x = list1.getHead();
                list1.setHead(list1.getHead().getNext());

                list2.setHead(x);
                list2.getHead().setNext(null);
                theohead1 = list2.getHead();

                //System.out.println(list1.getHead().getValue() +" " + list1.getHead().getNext().getValue());

                //leere liste besitzt nur ein element
            } else if (list1.getHead() != null && list1.getHead().getNext() == null) {

                x = list1.getHead();

                list2.setHead(x);
                list2.getHead().setNext(null);
                theohead1 = list2.getHead();
            }

        }
        //liste2 ist nicht leer
        //System.out.println(theohead1.getValue()+ "       " +list1.getHead().getValue());

        if (theohead1 != null && list1.getHead() != null) {

            //liste2 letztes oder einzigstes Element
            if (theohead1.getValue() < list1.getHead().getValue() && theohead1.getNext() == null) {

                //Liste1 hat mehrere Elemente
                if (list1.getHead().getNext() != null) {

                    x = list1.getHead();
                    //System.out.println(theohead1.getValue() + "  " + x.getValue());
                    list1.setHead(list1.getHead().getNext());
                    x.setNext(null);

                    list2.getHead().setNext(x);
                    theohead1 = list2.getHead();
                    listInsert(list1, list2);

                    //letztes Element aus Liste 1
                } else if (list1.getHead().getNext() == null) {

                    x = list1.getHead();

                    list2.getHead().setNext(x);

                    theohead1 = list2.getHead();
                    listInsert(list1, list2);

                }
                //Es gibt noch weitere Elemente in der Liste die geprüft werden müssen
                if (theohead1.getValue() < list1.getHead().getValue() && theohead1.getNext() != null) {
                    theohead2 = theohead1;
                    theohead1 = theohead1.getNext();
                    System.out.println(theohead2.getValue() + " hallo " + theohead1.getValue());
                    listInsert(list1, list2);
                }
            }

            //Liste 2 einfügen vor einem oder zwischen zwei elementen

            if (theohead1.getValue() >= list1.getHead().getValue()) {

                if (list1.getHead().getNext() != null) {

                    //einfügen eines neuen heads
                    if (theohead2 == null) {
                        x = list1.getHead();
                        list1.setHead(list1.getHead().getNext());
                        x.setNext(null);

                        x.setNext(theohead1);
                        list2.setHead(x);
                        theohead1 = list2.getHead();
                        listInsert(list1, list2);

                        //einfügen innerhalb der liste
                    } else if (theohead2 != null) {

                        x = list1.getHead();
                        list1.setHead(list1.getHead().getNext());
                        x.setNext(null);
                        x.setNext(theohead1);
                        theohead2.setNext(x);
                        theohead1 = list2.getHead();
                        theohead2 = null;
                        listInsert(list1, list2);

                    }

                } else if (list1.getHead().getNext() == null) {

                    System.out.println("Bingo");
                }
            }

        }//Programm Ende

    }


    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }


}