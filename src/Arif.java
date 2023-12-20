public class Arif implements Progression{
    int d, j;

    Arif(int d, int j){
        this.d = d;
        this.j = j;
    }

    public int S(){
        int s = 1;
        for(int i = 0; i<j;i++)
        {
            s += s+d;
        }
        return s;
    }
    public int J(){
        return d*(j-1)+1;
    }

    public void print(){
        System.out.println("Geom = ");
    }

}
