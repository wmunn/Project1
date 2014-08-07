/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bufmgr;

/**
 *
 * @author Ward 
 */
public class Clock extends Replacer {
    
    private int clock_counter;
  //  private FrameDescriptor[] frameTable;
    public static BufMgr bufferManager;
    
    public Clock(BufMgr bufferManager) {
        super(bufferManager)  ;
        clock_counter = 0  ;
    }
  
    public void newPage(FrameDescriptor fdesc) {
    }

    public void freePage(FrameDescriptor fdesc) {
    }

    public void pinPage(FrameDescriptor fdesc) {
    }

    public void unpinPage(FrameDescriptor fdesc){
    } 
  
	public int pick_victim() 
    {
		boolean located = false;
        for(int i = 0; i < frametab.length * 2; i++)
        {
            if(!frametab[clock_counter].validData)
            {
            	located = true;
                break;
            }
            
            if(frametab[clock_counter].pinCount == 0)
            {
                if(!frametab[clock_counter].referenced)
                {
                	located = true;
                    break;
                }
                frametab[clock_counter].referenced = false;
            }
            clock_counter = (clock_counter + 1) % frametab.length;
        }

        if(located)
        {
            return clock_counter;
        } else
        {
            return -1;
        }
    }

	@Override
	public int pickVictim() {
		// TODO Auto-generated method stub
		return 0;
	}
}