package myfilm.bean;

/**
 * @author MOYU
 * @File JavaSE_Study-myfilm.bean
 * @Date 2022/6/25 20:17
 **/
public class Business extends User{
    //店铺名称
    private String shopName;
    //店铺地址
    private String address;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Business business = (Business) o;

        if (shopName != null ? !shopName.equals(business.shopName) : business.shopName != null) return false;
        return address != null ? address.equals(business.address) : business.address == null;
    }

    @Override
    public int hashCode() {
        int result = shopName != null ? shopName.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
