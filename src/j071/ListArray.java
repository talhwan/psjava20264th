package j071;

public class ListArray {
    public static void main(String[] args) {
        ListArray alist = new ListArray();
        alist.add(11);
        alist.add(22);
        alist.add(2, 3003);
        alist.add(33);
        alist.add(44);
        alist.printAll();
        System.out.println(alist.get(2));
        alist.remove();
        alist.printAll();
        alist.remove(1);
        alist.printAll();
        /*
        1-1. add(Object o); //목록추가
        1-2. add(int index, Object o) // 순서 지정해서 목록추가

        2-1. remove(); //맨뒤에 있는 항목 삭제
        2-2. remove(int index) // 지정한 항목 삭제

        get(int index); //특정순번에 있는 항목 가져오기

        배열만 이용해서 구현!
        * */
        /*
        ListArray alist = new ListArray();
        alist.add(??);
        alist.get(2);
        alist.remove();
        */
    }

    Object[] list;
    public ListArray() {
        list = new Object[0];
    }
    public int size(){
        return list.length;
    }
    public void printAll(){
        for(int i=0;i<list.length;i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public void add(int index, Object o){
        Object[] newList = new Object[list.length+1];
        for(int i=0;i<index;i++){
            newList[i]=list[i];
        }
        newList[index]=o;
        for(int i=index;i<list.length;i++){
            newList[i + 1]=newList[i];
        }
        list=newList;
    }
    public void add(Object o){
        // 아무것도 없는 경우
        /*Object[] newList = new Object[1];
        newList[0] = o;
        list = newList;*/
        //뭐가 이미 있는 경우
        Object[] newList = new Object[list.length+1];
        for(int i=0;i<list.length;i++){
            newList[i]=list[i];
        }
        newList[list.length]=o;
        list=newList;
    }
    public Object get(int i){
        return list[i];
    }
    public void remove(int order){
        Object[] newList = new Object[list.length-1];
        for(int i=0;i<order;i++){
            newList[i]=list[i];
        }
       // 0 1 2 3 4 => 0 1 3 4
        for(int i=order;i<newList.length;i++){
            newList[i]=list[i + 1];
        }
        list=newList;
    }
    public void remove(){
        remove(list.length-1);
        /*Object[] newList = new Object[list.length-1];
        for(int i=0;i<newList.length;i++){
            newList[i]=list[i];
        }
        list=newList;*/
    }
}
