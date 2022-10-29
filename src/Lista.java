public class Lista {
    private No primeiro;

    public Lista() {
        primeiro = null;
    }
    
    
    //Verifica se está vazio
    public boolean estaVazia() {
        return primeiro == null;
    }
    
    //Mostra toda a Lista
    public void mostrar() {
        No auxiliar = primeiro;
        while (auxiliar != null) {
            System.out.print(auxiliar.getInfo() + " -> ");
            auxiliar = auxiliar.getKey();
        }
    }

    
    //Insere na primeira posição da Lista
    public void inserePrimeiro(int info) {
        No auxiliar = new No();
        auxiliar.setInfo(info);
        auxiliar.setKey(primeiro);
        primeiro = auxiliar;
    }

  

    //Insere depois do No passado como parametro
    public void insereDepois(No No, int Info) {
        if (estaVazia()) {
            inserePrimeiro(Info);
        }
        else {
            No auxiliar = this.primeiro;
            if (auxiliar.getKey() != null) {
                while ((auxiliar != null && auxiliar.getKey() != null) && (auxiliar != No)) {
                    auxiliar = auxiliar.getKey();
                }
            }
            if (auxiliar == No) {
                No novo = new No();
                novo.setInfo(Info);
                novo.setKey(auxiliar.getKey());
                auxiliar.setKey(novo);
            }
        }
    }
    
    
    
    public No procurar(int info) {
        No procura = this.primeiro;
        No retorno = null;
        while ((procura != null && procura.getKey() != null) && procura.getInfo() != info) {
            procura = procura.getKey();
        }
        if (procura.getInfo() == info) {
            retorno = procura;
        }
        return retorno;
    }

    //Insere na ultima posição na Lista
    public void insereUltimo(int Info) {
        if (estaVazia()) {
            inserePrimeiro(Info);
        } else {
            No auxiliar = primeiro;
            while (auxiliar != null && auxiliar.getKey() != null) {
                auxiliar = auxiliar.getKey();
            }

            if (auxiliar.getKey() == null) {
                No novo = new No();
                novo.setInfo(Info);
                auxiliar.setKey(novo);
            }
        }
    }

    
    public No removePrimeiro() {
    	 if(estaVazia()){
             this.primeiro = null;
         }
    	 else{
            No retorno = this.primeiro;
            if (this.primeiro.getKey() != null) {
                No auxiliar = this.primeiro.getKey();
                this.primeiro = this.primeiro.getKey();
                while (auxiliar.getKey() != null) {
                    auxiliar = auxiliar.getKey();
                }
            } 
            return retorno;
        } 
    	 
           return null;
        
    }

    //Remove o No passado como Parametro
    public No remove(No no) {
        No retorno = null;
        if (!estaVazia()) {
            No auxiliar = this.primeiro;
            if (auxiliar.getKey() != null) {
                No anterior = null;
                while ((auxiliar != null && auxiliar.getKey() != null) && (auxiliar != no)) {
                    anterior = auxiliar;
                    auxiliar = auxiliar.getKey();
                }
                if (auxiliar == no) {
                 if (anterior != null) {
                    anterior.setKey(auxiliar.getKey());
                    retorno = auxiliar;
                }
                }
            } 
            else {
                retorno = removePrimeiro();
            }
        }
        return retorno;
    }
    //Remove o ultimo No na Lista
    public No removeUltimo() {
        No retorno = null;
        if (!estaVazia()) {
            if (this.primeiro.getKey() != null) {
                No auxiliar = this.primeiro;
                No seguinte = auxiliar.getKey();
                while (seguinte.getKey() != null) {
                    auxiliar = seguinte;
                    seguinte = seguinte.getKey();
                }
                if (seguinte.getKey() == null) {
                    auxiliar.setKey(null);
                    retorno = seguinte;
                }
            } else {
                retorno = this.primeiro;
                this.primeiro = null;
            }
        }
        return retorno;
    }

   
}