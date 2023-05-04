package homework.hw9;

public enum Size {
    SMALL("S",10,30),
    MEDIUM("M",15,40),
    LARGE("L",20,50),
    EXTRA_LARGE("XL",25,60);
   private int width,length;
    private String briefName;


    Size( String briefName, int width, int length) {
        this.width = width;
        this.length = length;
        this.briefName = briefName;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getBriefName() {
        return briefName;
    }

    @Override
    public String toString() {
        return "\""+getBriefName()+"\" size: width="+getWidth()+", length="+getLength();
        }
    }

