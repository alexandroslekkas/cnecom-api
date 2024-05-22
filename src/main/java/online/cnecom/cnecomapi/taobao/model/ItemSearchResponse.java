package online.cnecom.cnecomapi.taobao.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemSearchResponse {
    @JsonProperty("items")
    private List<Item> items;

    // Other fields can be added as needed, e.g., error_code, reason, etc.

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Item {
        private String title;
        @JsonProperty("pic_url")
        private String picUrl;
        @JsonProperty("promotion_price")
        private String promotionPrice;
        @JsonProperty("orginal_price")
        private String originalPrice;
        private String price;
        private int sales;
        @JsonProperty("num_iid")
        private String numIid;
        @JsonProperty("seller_nick")
        private String sellerNick;
        @JsonProperty("seller_id")
        private String sellerId;
        @JsonProperty("detail_url")
        private String detailUrl;

        // Getters and Setters

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getPromotionPrice() {
            return promotionPrice;
        }

        public void setPromotionPrice(String promotionPrice) {
            this.promotionPrice = promotionPrice;
        }

        public String getOriginalPrice() {
            return originalPrice;
        }

        public void setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public int getSales() {
            return sales;
        }

        public void setSales(int sales) {
            this.sales = sales;
        }

        public String getNumIid() {
            return numIid;
        }

        public void setNumIid(String numIid) {
            this.numIid = numIid;
        }

        public String getSellerNick() {
            return sellerNick;
        }

        public void setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
        }

        public String getSellerId() {
            return sellerId;
        }

        public void setSellerId(String sellerId) {
            this.sellerId = sellerId;
        }

        public String getDetailUrl() {
            return detailUrl;
        }

        public void setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
        }
    }
}
