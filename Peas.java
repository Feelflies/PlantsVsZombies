public class Peas
{
    private int damage;
    private int x;
    private int y;
    
    public Peas(int d, int x1, int y1)
    {
        d = damage;
        x = x1;
        y = y1;
    }
    public int getX()
    {
        return x;
        
    }
    public int getY()
    {
        return y;
    }
    public boolean checkCollision(Peas p)
    {
        if(p.getX() == x)
        {
            return true;
        }
        return false;
    } 
    public void Move()
    {
        
    }
}