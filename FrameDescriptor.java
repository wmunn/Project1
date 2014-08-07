/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bufmgr;

import global.Page;
import global.PageId;
import global.GlobalConst;

/**
 *
 * @author Ward
 */
public class FrameDescriptor implements GlobalConst {

	//Number of times the page currently in a frame has been requested but not released the number of 
	//current users of the page
    int pinCount;
    
    //The boolean variable dirty indicates whether the page has been modified since it was brought
    //into the buffer pool from disk.
    boolean dirty;

    //id of the Page in the frame
    PageId pageId;

    //frameNumber
    int frameNumber;
    
    //validData boolean
    boolean validData;
    
    //referenced boolean
    boolean referenced;
    
    //page of type Page  
    Page page; 
    
    //Constructor
    public FrameDescriptor(){
        frameNumber = 0;
        dirty = false;     //turned off
        validData = false;
        page = null;
        pageId = null;
        pinCount = 0;      //set to 0 initially
    }

    public int getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(int frameNumber) {
        this.frameNumber = frameNumber;
    }
       
     public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isValidData() {
        return validData;
    }

    public void setValidData(boolean validData) {
        this.validData = validData;
    }

    public boolean isReferenced() {
        return referenced;
    }

    public void setReferenced(boolean referenced) {
        this.referenced = referenced;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public PageId getPageId() {
        return pageId;
    }

    public void setPageId(PageId pageId) {
        this.pageId = pageId;
    }

    public int getPinCount() {
        return pinCount;
    }

    public void setPinCount(int pinCount) {
        this.pinCount = pinCount;
    }
   
}
