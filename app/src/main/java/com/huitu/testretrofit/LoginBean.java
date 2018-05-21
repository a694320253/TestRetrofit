package com.huitu.testretrofit;

import java.util.List;

/**
 * Created by Administrator on 2018/5/14.
 */

public class LoginBean {

    /**
     * message : 登陆成功
     * result : {"maplist":[{"dicJifen":14,"userResearchArea":"","userEnclosure":"","userIdentity":"123456789555","userCategory":"","userThirdid":"","orderName":"","userPassword":"123456","userCompany":"","userEmail":"","expertCategory":0,"userPlotarea":"","userAddress":"110101001001","userDepartment":"","page":0,"userId":473,"dicDel":"6","userSysrole":0,"userName":"ceshinh1","userPhone":"53840051","userPlanttype":"","userBusiness":"","userImg":"http://123.56.69.223:8086/UploadFile/YYZZ/c22aae22ffaa42c79e856240e84b0d76.png","userThirdmark":"0","userArea":"","userDetailaddr":"fd","userExamine":"2","examineUserName":"","userRole":3,"userRealname":"真实姓名","userLastlogintime":"","size":0,"problemCount":0,"researchName":"","userUpdatestatus":0,"gisGisid":"","expertSort":"","address":"北京市市辖区东城区东华门街道办事处多福巷社区","userAt":"2017-11-20 13:30:18","userExamineid":0,"userCrops":"","userDel":"1"}]}
     * rowCount : 1
     * code : 10000
     */

    private String message;
    private ResultBean result;
    private int rowCount;
    private String code;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static class ResultBean {
        private List<MaplistBean> maplist;

        public List<MaplistBean> getMaplist() {
            return maplist;
        }

        public void setMaplist(List<MaplistBean> maplist) {
            this.maplist = maplist;
        }

        public static class MaplistBean {
            /**
             * dicJifen : 14
             * userResearchArea :
             * userEnclosure :
             * userIdentity : 123456789555
             * userCategory :
             * userThirdid :
             * orderName :
             * userPassword : 123456
             * userCompany :
             * userEmail :
             * expertCategory : 0
             * userPlotarea :
             * userAddress : 110101001001
             * userDepartment :
             * page : 0
             * userId : 473
             * dicDel : 6
             * userSysrole : 0
             * userName : ceshinh1
             * userPhone : 53840051
             * userPlanttype :
             * userBusiness :
             * userImg : http://123.56.69.223:8086/UploadFile/YYZZ/c22aae22ffaa42c79e856240e84b0d76.png
             * userThirdmark : 0
             * userArea :
             * userDetailaddr : fd
             * userExamine : 2
             * examineUserName :
             * userRole : 3
             * userRealname : 真实姓名
             * userLastlogintime :
             * size : 0
             * problemCount : 0
             * researchName :
             * userUpdatestatus : 0
             * gisGisid :
             * expertSort :
             * address : 北京市市辖区东城区东华门街道办事处多福巷社区
             * userAt : 2017-11-20 13:30:18
             * userExamineid : 0
             * userCrops :
             * userDel : 1
             */

            private int dicJifen;
            private String userResearchArea;
            private String userEnclosure;
            private String userIdentity;
            private String userCategory;
            private String userThirdid;
            private String orderName;
            private String userPassword;
            private String userCompany;
            private String userEmail;
            private int expertCategory;
            private String userPlotarea;
            private String userAddress;
            private String userDepartment;
            private int page;
            private int userId;
            private String dicDel;
            private int userSysrole;
            private String userName;
            private String userPhone;
            private String userPlanttype;
            private String userBusiness;
            private String userImg;
            private String userThirdmark;
            private String userArea;
            private String userDetailaddr;
            private String userExamine;
            private String examineUserName;
            private int userRole;
            private String userRealname;
            private String userLastlogintime;
            private int size;
            private int problemCount;
            private String researchName;
            private int userUpdatestatus;
            private String gisGisid;
            private String expertSort;
            private String address;
            private String userAt;
            private int userExamineid;
            private String userCrops;
            private String userDel;

            public int getDicJifen() {
                return dicJifen;
            }

            public void setDicJifen(int dicJifen) {
                this.dicJifen = dicJifen;
            }

            public String getUserResearchArea() {
                return userResearchArea;
            }

            public void setUserResearchArea(String userResearchArea) {
                this.userResearchArea = userResearchArea;
            }

            public String getUserEnclosure() {
                return userEnclosure;
            }

            public void setUserEnclosure(String userEnclosure) {
                this.userEnclosure = userEnclosure;
            }

            public String getUserIdentity() {
                return userIdentity;
            }

            public void setUserIdentity(String userIdentity) {
                this.userIdentity = userIdentity;
            }

            public String getUserCategory() {
                return userCategory;
            }

            public void setUserCategory(String userCategory) {
                this.userCategory = userCategory;
            }

            public String getUserThirdid() {
                return userThirdid;
            }

            public void setUserThirdid(String userThirdid) {
                this.userThirdid = userThirdid;
            }

            public String getOrderName() {
                return orderName;
            }

            public void setOrderName(String orderName) {
                this.orderName = orderName;
            }

            public String getUserPassword() {
                return userPassword;
            }

            public void setUserPassword(String userPassword) {
                this.userPassword = userPassword;
            }

            public String getUserCompany() {
                return userCompany;
            }

            public void setUserCompany(String userCompany) {
                this.userCompany = userCompany;
            }

            public String getUserEmail() {
                return userEmail;
            }

            public void setUserEmail(String userEmail) {
                this.userEmail = userEmail;
            }

            public int getExpertCategory() {
                return expertCategory;
            }

            public void setExpertCategory(int expertCategory) {
                this.expertCategory = expertCategory;
            }

            public String getUserPlotarea() {
                return userPlotarea;
            }

            public void setUserPlotarea(String userPlotarea) {
                this.userPlotarea = userPlotarea;
            }

            public String getUserAddress() {
                return userAddress;
            }

            public void setUserAddress(String userAddress) {
                this.userAddress = userAddress;
            }

            public String getUserDepartment() {
                return userDepartment;
            }

            public void setUserDepartment(String userDepartment) {
                this.userDepartment = userDepartment;
            }

            public int getPage() {
                return page;
            }

            public void setPage(int page) {
                this.page = page;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public String getDicDel() {
                return dicDel;
            }

            public void setDicDel(String dicDel) {
                this.dicDel = dicDel;
            }

            public int getUserSysrole() {
                return userSysrole;
            }

            public void setUserSysrole(int userSysrole) {
                this.userSysrole = userSysrole;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public String getUserPhone() {
                return userPhone;
            }

            public void setUserPhone(String userPhone) {
                this.userPhone = userPhone;
            }

            public String getUserPlanttype() {
                return userPlanttype;
            }

            public void setUserPlanttype(String userPlanttype) {
                this.userPlanttype = userPlanttype;
            }

            public String getUserBusiness() {
                return userBusiness;
            }

            public void setUserBusiness(String userBusiness) {
                this.userBusiness = userBusiness;
            }

            public String getUserImg() {
                return userImg;
            }

            public void setUserImg(String userImg) {
                this.userImg = userImg;
            }

            public String getUserThirdmark() {
                return userThirdmark;
            }

            public void setUserThirdmark(String userThirdmark) {
                this.userThirdmark = userThirdmark;
            }

            public String getUserArea() {
                return userArea;
            }

            public void setUserArea(String userArea) {
                this.userArea = userArea;
            }

            public String getUserDetailaddr() {
                return userDetailaddr;
            }

            public void setUserDetailaddr(String userDetailaddr) {
                this.userDetailaddr = userDetailaddr;
            }

            public String getUserExamine() {
                return userExamine;
            }

            public void setUserExamine(String userExamine) {
                this.userExamine = userExamine;
            }

            public String getExamineUserName() {
                return examineUserName;
            }

            public void setExamineUserName(String examineUserName) {
                this.examineUserName = examineUserName;
            }

            public int getUserRole() {
                return userRole;
            }

            public void setUserRole(int userRole) {
                this.userRole = userRole;
            }

            public String getUserRealname() {
                return userRealname;
            }

            public void setUserRealname(String userRealname) {
                this.userRealname = userRealname;
            }

            public String getUserLastlogintime() {
                return userLastlogintime;
            }

            public void setUserLastlogintime(String userLastlogintime) {
                this.userLastlogintime = userLastlogintime;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public int getProblemCount() {
                return problemCount;
            }

            public void setProblemCount(int problemCount) {
                this.problemCount = problemCount;
            }

            public String getResearchName() {
                return researchName;
            }

            public void setResearchName(String researchName) {
                this.researchName = researchName;
            }

            public int getUserUpdatestatus() {
                return userUpdatestatus;
            }

            public void setUserUpdatestatus(int userUpdatestatus) {
                this.userUpdatestatus = userUpdatestatus;
            }

            public String getGisGisid() {
                return gisGisid;
            }

            public void setGisGisid(String gisGisid) {
                this.gisGisid = gisGisid;
            }

            public String getExpertSort() {
                return expertSort;
            }

            public void setExpertSort(String expertSort) {
                this.expertSort = expertSort;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getUserAt() {
                return userAt;
            }

            public void setUserAt(String userAt) {
                this.userAt = userAt;
            }

            public int getUserExamineid() {
                return userExamineid;
            }

            public void setUserExamineid(int userExamineid) {
                this.userExamineid = userExamineid;
            }

            public String getUserCrops() {
                return userCrops;
            }

            public void setUserCrops(String userCrops) {
                this.userCrops = userCrops;
            }

            public String getUserDel() {
                return userDel;
            }

            public void setUserDel(String userDel) {
                this.userDel = userDel;
            }
        }
    }
}
