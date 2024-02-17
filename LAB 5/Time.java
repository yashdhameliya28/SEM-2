 class Time {
    int hour;
    int minutes;
    int second;
    
    void add(Time t2){
        this.hour = this.hour + t2.hour;
        this.minutes =  this.minutes + t2.minutes;
        this.second =  this.second + t2.second;

        if(this.second >= 60){
            this.second = this.second - 60;
            this.minutes++;
        }
        if(this.minutes >= 60){
            this.minutes = this.minutes - 60;
            this.hour++;
        }
    }

}
