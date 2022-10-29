public class No {
    private Integer info;
    private No key;

    public No(){
        info = null;
        key = null;
    }
    
    //Getters e Setters

    public void setInfo(Integer info){
    this.info = info;
    }
    
    public Integer getInfo(){
        return this.info;
    }
    
    

    public void setKey(No key){
        this.key = key;
    }

    public No getKey(){
        return this.key;
       
    }

  
}