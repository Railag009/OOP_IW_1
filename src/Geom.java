public class Geom implements Progression{
    int d, j;

    Geom(int d, int j){
        this.d = d;
        this.j = j;
    }

    public int S(){
        int s = 1;
        int sum = 0;
        for(int i = 0; i<j;i++)
        {
            sum += s;
            s *= d;
        }
        return sum;
    }

    public int J(){
        return (int) Math.pow(d, j-1);
    }
    public void print(){
        System.out.println("Arif = ");
    }
}
