/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bufmgr;

import global.Page;
import global.PageId;

/**
 *
 * @author Ward
 */
public class FrameDescriptor {

    int frameNumber;
    boolean dirty;
    boolean validData;
    boolean referenced;
    Page page;
    PageId pageId;
    int pinCount;
    
    public FrameDescriptor(){
        frameNumber = 0;
        dirty = false;
        validData = false;
        page = null;
        pageId = null;
        pinCount = 0;
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
