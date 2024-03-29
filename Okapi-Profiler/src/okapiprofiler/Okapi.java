/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package okapiprofiler;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author QiangWu
 */
public class Okapi {

    File okapiRoot;
    File database;
    File enviset;
    File dbavail;
    File stopword;
    ArrayList<String> dbList;
    JTable okapiFilesTable;
    JTable okapiDbListTable;

    public Okapi() {
        this.okapiRoot = null;
        this.enviset = null;
        this.dbavail = null;
        this.stopword = null;
        this.dbList = null;
        this.okapiFilesTable = null;

    }

    public File getOkapiRoot() {
        return this.okapiRoot;
    }

    public void setOkapiRoot(File okapiRoot) {
        this.okapiRoot = okapiRoot;
    }

    public File getDatabase() {
        return this.database;
    }

    public void setDatabase(File database) {
        this.database = database;
    }

    public JTable getOkapiFilesTable() {
        return this.okapiFilesTable;
    }

    public void setOkapiFilesTable(JTable okapiFilesTable) {
        this.okapiFilesTable = okapiFilesTable;
    }

    public JTable getOkapiDbListTable() {
        return this.okapiDbListTable;
    }

    public void setOkapiDbListTable(JTable okapiDbListTable) {
        this.okapiDbListTable = okapiDbListTable;
    }

    public File getEnviset() {
        return this.enviset;
    }

    public void setEnviset(File enviset) {
        this.enviset = enviset;
    }

    public File getDbavail() {
        return this.dbavail;
    }

    public void setDbavail(File dbavail) {
        this.dbavail = dbavail;
    }

    public File getStopword() {
        return this.stopword;
    }

    public void setStopword(File stopword) {
        this.stopword = stopword;
    }

    public ArrayList<String> getDbList() {
        return this.dbList;
    }

    public void setDbList(ArrayList<String> dbList) {
        this.dbList = dbList;
    }
}
