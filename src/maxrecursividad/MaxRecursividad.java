package maxrecursividad;

public class MaxRecursividad {
    public static void main(String[] args) { 
        int[] a = Array();
        int menor = 0;
        
        BuscarMenor b = new BuscarMenor();
        
        OrdenarPorMezcla(a);
        
        b.buscarMenor(a, a.length-1);
        
        menor = b.menor;
        
        System.out.println("El número máximo en el arreglo es: " + a[a.length-1]);
        System.out.println("El número menor inmediatamente anterior a este es: " + a[menor]);        
        
        
        
    }
    
    public static int[] Array(){
        int n = (int) ((Math.random() * 10000) + 1);
        int[] a = new int[n];
        
        for (int i = 0; i < n ; i++){
            a[i] = (int) ((Math.random() * 10000) + 1);
        }
        
        return a;
    }
    
    public static void OrdenarPorMezcla(int[]a){
        int[] aux = new int[a.length];
        
        OrdenarPorMezcla(a,aux,0,a.length-1);
    }
    
    public static void Mezclar(int[] a, int[] aux, int inf, int medio, int sup){
        int izq = inf;
        int der = medio + 1;
        int pos = inf;
        
        while (izq <= medio && der <= sup){
            if (a[izq] < a[der]){
                aux[pos++] = a[izq++];
            }
            else {
                aux[pos++] = a[der++];
            }
        }
        
        while (izq <= medio){
            aux[pos++] = a[izq++];
        }
        
        while (der <= sup){
            aux[pos++] = a[der++];
        }
        
        System.arraycopy(aux,inf,a,inf,sup-inf+1);
        
    }
    
   private static void OrdenarPorMezcla(int[]a, int[] aux, int inf, int sup){
       if (inf<sup){
           int medio = (inf + sup) / 2;
           OrdenarPorMezcla(a,aux,inf,medio);
           OrdenarPorMezcla(a,aux,medio+1,sup);
           Mezclar(a,aux,inf,medio,sup);
       }
   }
    
}
