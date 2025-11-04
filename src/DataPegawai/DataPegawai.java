package DataPegawai;
public class DataPegawai {

    private Link first;
    
    public DataPegawai(){
        first = null;
    }
    
    /**
     * In-place bubble sort for the linked list. Swaps node data (name and no)
     * to order nodes ascending by 'no'. This avoids creating intermediate arrays.
     */
    public void BubleSort(){
        if (first == null || first.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            Link current = first;
            while (current.next != null) {
                if (current.getNo() > current.next.getNo()) {
                    // swap data between current and current.next
                    long tmpNo = current.getNo();
                    String tmpNama = current.getNama();
                    current.setNo(current.next.getNo());
                    current.setNama(current.next.getNama());
                    current.next.setNo(tmpNo);
                    current.next.setNama(tmpNama);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    /**
     * Overload to allow calling list.BubleSort(list) as in user's existing code.
     */
    public void BubleSort(DataPegawai other){
        if (other == null) return;
        other.BubleSort();
    }
    public void tambahData(String nama, long no){
        Link aLink = new Link(nama, no);
        aLink.next = first;
        first = aLink;
    }
    
    public Link hapusDataPertama(){
        Link temp = first;
        first = first.next;
        return temp;
    }
    
    public void displayData(){
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    
}
