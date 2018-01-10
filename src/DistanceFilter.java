
  public class DistanceFilter implements Filter
{
    private Location givenLoc; 
    private double maxDis;
    
    public DistanceFilter(Location loc, double dist) { 
        givenLoc = loc;
        maxDis = dist;
    } 

    public boolean satisfies(QuakeEntry qe) { 
        return qe.getLocation().distanceTo(givenLoc) < maxDis; 
    } 
    
    public String getName(){
        return "DistanceFilter";
    }
}
