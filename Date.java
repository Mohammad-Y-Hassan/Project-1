/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc211.project;

/**
 *
 * @author itlabs
 */
public class Date {

    /**
     * @param args the command line arguments
     */ 
    private int year; 
    private int month; 
    private int day; 
    
    
    
    public Date() { 
        year = 2001; 
        month = 1; 
        day = 1;
    }
    public Date(int z, int y, int x) { 
        month = z; 
        day = y; 
        year= x; 
    }
    public Date(Date other) { 
        year = other.year; 
        month = other.month; 
        day = other.day; 
    }
    public int getYear() { 
        return year;
    } 
    public int getMonth() { 
        return month;
    } 
    public int getDay() { 
        return day;
    }
    public void setYear(int yy) { 
        if(yy>=1900 && yy<=2022) { 
            year = yy;
        } else { 
            year = 2001;
        }
    } 
    public void setMonth(int mm) { 
        if(mm>=1 && mm<=12) { 
            month = mm; 
        } else { 
            month = 1;
        }
    } 
    public void setDay(int dd) { 
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) { 
            if(dd>=1 && dd<=31) { 
                day = dd;
            } else { 
                day =1;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) { 
            if(dd>=1 && dd<=30) { 
                day = dd;
            } else { 
                day = 1;
            }
        } else if(month == 2){ 
            if(dd>=1 && dd<=28) { 
                day = dd; 
            } else { 
                day =1; 
            }
        } 
    } 
    @Override
    public String toString() { 
        String dateString = String.format("Date: %02d-%02d-%04d", month, day, year); 
        return dateString;
    } 
    public boolean equals(Date other) { 
        return month == other.month && day == other.day && year == other.year; 
    }
    
    
}
