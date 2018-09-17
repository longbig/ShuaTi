package xie.cheng2019;

import java.util.*;
/**
 * @date 2018年9月4日 下午6:31:59
 * @author 龙
 * 类描述：
 */
public class Main3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int capacity = input.nextInt();
		LRUCache caches = new LRUCache(capacity);
		ArrayList<Integer> list = new ArrayList<>();
		String command = null;
		input.nextLine();
		while(!(command = input.nextLine()).equals("")) {
			String[] strings = command.split(" ");
			char behavior = strings[0].charAt(0);
			if(behavior == 'p') {
				int k = Integer.valueOf(strings[1]);
				int v = Integer.valueOf(strings[2]);
				caches.put(k, v);
			}
			
			if(behavior == 'g') {
				int k = Integer.valueOf(strings[1]);
				list.add(caches.get(k));
			}
	
		}
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
	}

}
class LRUCache {
    
    int capacity;
    Map<Integer,Node> map = new HashMap<Integer,Node>();
    Node head = null;
    Node end = null;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)) {
            Node temp = map.get(key);
            remove(temp);
            setHead(temp);
            return temp.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        
        if(map.containsKey(key)) {
            Node old = map.get(key);
            old.value = value; 
            remove(old);
            setHead(old);
        } else {
            Node created = new Node(key,value);
            if(map.size()>=capacity) {
                map.remove(end.key);
                remove(end);
                setHead(created);
            } else 
                setHead(created);
            map.put(key,created);
        }
    }
    
    public void remove(Node n) {
        if(n.pre!=null) 
            n.pre.next = n.next;
        else
            head = n.next;
        
        if(n.next!=null) 
            n.next.pre = n.pre;
        else 
            end = n.pre;
        
    }
    
    public void setHead(Node n) {
                    
        n.next = head; 
        n.pre = null;
        
        if(head!=null)
            head.pre=n;
        head = n; 
        
        if(end == null)
            end = head;        
    }
}
class Node {
    int key;
    int value;
    Node pre;
    Node next;
    
    Node(int key, int value){
        this.key = key; 
        this.value = value;
    }
}
