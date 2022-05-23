import java.util.Vector;

public class Queue {
	private Vector <Object> elenco = new Vector <Object>();
	
	public boolean push(Object obj) {

		boolean flag = false;
		try{
			elenco.add(obj);
			flag = true;
		}catch(Exception e){
			flag = false;
		}
		return (flag!=true) ? true : false;
	}
	
	public Object pop() {
		Object o = elenco.elementAt(0);
		elenco.remove(0);
		return o;
	}
	
	public Object get(int i){
		return elenco.get(i);
	}

	public boolean empty() {
		return (elenco.size() == 0) ? true : false;
	}

	public int size(){
		return elenco.size();
	}

	public boolean visuallizza(){
	boolean flag = false;
		try{
			for(int i=0; i<elenco.size(); i++){
				System.out.println(elenco.elementAt(i));
			}
			flag = true;
		}catch(Exception e){
			flag = false;
		}
		return (flag!=true) ? false : true;
	}

	@Override
	public String toString() {
		return "" + elenco;
	}
}