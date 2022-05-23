public class StringDivider {

  private Queue fields = new Queue();

  public StringDivider(String s, String d){
    String field = "";
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) != d.charAt(0)){
        field += s.charAt(i);
      }else{
        fields.push(field);
        field = "";
      }
    }
  }

  public boolean hasFields(){
    return (fields.size() < 1) ? false : true;
  }

  public int countFields(){
    return fields.size();
  }

  public String nextField(){
    return (String)fields.pop();
  }
}
