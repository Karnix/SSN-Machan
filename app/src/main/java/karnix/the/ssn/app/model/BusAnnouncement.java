package karnix.the.ssn.app.model;

/**
 * Created by vvvro on 5/2/2017.
 */

public class BusAnnouncement {
        public String pid;
        public String uid;
        public String userName;
        public Long postedDate;
        public String content;
        public String userProfileURL;
        public String title;

        public BusAnnouncement() {

        }

        public BusAnnouncement(String postID, String userName, String userID, Long postDate, String profileImageURL, String title,String postContent) {
            pid = postID;
            uid = userID;
            this.userName = userName;
            postedDate = postDate;
            userProfileURL = profileImageURL;
            content = postContent;
            this.title = title;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public Long getPostedDate() {
            return postedDate;
        }

        public void setPostedDate(Long postedDate) {
            this.postedDate = postedDate;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getUserProfileURL() {
            return userProfileURL;
        }

        public void setUserProfileURL(String userProfileURL) {
            this.userProfileURL = userProfileURL;
        }

        public void setTitle(String title){
            this.title = title;
        }

        public String getTitle(){
            return title;
        }


        @Override
        public String toString() {
            return "Post{" +
                    "pid='" + pid + '\'' +
                    ", uid='" + uid + '\'' +
                    ", userName='" + userName + '\'' +
                    ", postedDate=" + postedDate +
                    ", content='" + content + '\'' +
                    ", userProfileURL='" + userProfileURL +
                    '}';
        }

}