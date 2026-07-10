class TimeStamp{
    String value;
    int timeStamp;
    public TimeStamp(String value, int timeStamp) {
        this.value = value;
        this.timeStamp = timeStamp;
    }
}
class TimeMap {
    HashMap<String, ArrayList<TimeStamp>> map = new HashMap<>();

    public TimeMap() {
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        ArrayList<TimeStamp> vals = map.get(key);
        vals.add(new TimeStamp(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        ArrayList<TimeStamp> vals = map.get(key);
        TimeStamp result = binSearch(vals, timestamp);
        if(result==null) return "";
        return result.value;
    }

    public TimeStamp binSearch(ArrayList<TimeStamp> arr, int target) {
        int start = 0;
        int end = arr.size()-1;
        int idx = -1;
        while(start<=end) {
            int mid = start + (end-start) / 2;
            TimeStamp curr = arr.get(mid);
            if(curr.timeStamp<=target) {
                idx = mid;
                start = mid+1;
            } else end=mid-1;
        }
        if(idx==-1) return null;
        return arr.get(idx);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */