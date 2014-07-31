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
    
    private int current;
    private FrameDescriptor[] frameTable;
    public static BufMgr bufferManager;
    
    public Clock() {
        super(bufferManager)  ;
        current = 0;
    }
  
    public void newPage(FrameDescriptor fdesc) {
        fdesc.pageId;
    }

    public void freePage(FrameDescriptor fdesc) {
      
    }

    public void pinPage(FrameDescriptor fdesc) {
      
    }

    public void unpinPage(FrameDescriptor fdesc){

    } 
  
    public int pickVictim(){
        boolean victimChosen = false;
        int numOfFrames = bufferManager.getNumFrames();
        for (int i = 0; i < numOfFrames && !victimChosen; i++) {
            if((frameTable[current].getPinCount() > 0) || (frameTable[current].isReferenced())){
                //not chosen
            } else if ((frameTable[current].getPinCount() == 0) && (frameTable[current].isReferenced())){
                //not chosen
                frameTable[current].setReferenced(false);
            } else {
                victimChosen = true;   
            }
            if (!victimChosen) {
                current++;
                current = current % numOfFrames;
            }
        }
        if (victimChosen)
            return current;
        return -1;
    }
    
}
