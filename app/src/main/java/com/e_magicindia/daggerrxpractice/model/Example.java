package com.e_magicindia.daggerrxpractice.model;

/**
 * Created by mkodekar on 8/17/2016.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Example {

    @SerializedName("Item_Id")
    @Expose
    private String itemId;
    @SerializedName("Item_Name")
    @Expose
    private String itemName;
    @SerializedName("Item_ItypeId")
    @Expose
    private String itemItypeId;
    @SerializedName("Item_UOMId")
    @Expose
    private String itemUOMId;
    @SerializedName("UOM_Name")
    @Expose
    private String uOMName;
    @SerializedName("Item_BrandId")
    @Expose
    private String itemBrandId;
    @SerializedName("Item_CategoryId")
    @Expose
    private String itemCategoryId;
    @SerializedName("Item_Tax_Id")
    @Expose
    private String itemTaxId;
    @SerializedName("Item_MRP")
    @Expose
    private String itemMRP;
    @SerializedName("Stock_Status")
    @Expose
    private String stockStatus;
    @SerializedName("Item_distributor")
    @Expose
    private String itemDistributor;
    @SerializedName("Item_Dealer")
    @Expose
    private String itemDealer;
    @SerializedName("Item_SRate")
    @Expose
    private String itemSRate;
    @SerializedName("Item_DCRate")
    @Expose
    private String itemDCRate;
    @SerializedName("Item_Reorder")
    @Expose
    private String itemReorder;
    @SerializedName("Item_Minimum")
    @Expose
    private String itemMinimum;
    @SerializedName("Item_Maximum")
    @Expose
    private String itemMaximum;
    @SerializedName("Item_Deleted")
    @Expose
    private String itemDeleted;
    @SerializedName("Item_Cases")
    @Expose
    private String itemCases;
    @SerializedName("Item_ActRate")
    @Expose
    private String itemActRate;
    @SerializedName("Item_ImgPath")
    @Expose
    private String itemImgPath;
    @SerializedName("Item_Descriptions")
    @Expose
    private String itemDescriptions;
    @SerializedName("MainGroup_Id")
    @Expose
    private String mainGroupId;
    @SerializedName("MainGroup_Name")
    @Expose
    private String mainGroupName;
    @SerializedName("MainGroup_SortNo")
    @Expose
    private String mainGroupSortNo;
    @SerializedName("MainGroup_Template")
    @Expose
    private Object mainGroupTemplate;
    @SerializedName("MainGroup_Remarks")
    @Expose
    private Object mainGroupRemarks;
    @SerializedName("Active")
    @Expose
    private String active;
    @SerializedName("MainGroup_ImgPath")
    @Expose
    private String mainGroupImgPath;

    /**
     * No args constructor for use in serialization
     */
    public Example() {
    }

    /**
     * @param mainGroupTemplate
     * @param itemDescriptions
     * @param itemReorder
     * @param itemTaxId
     * @param itemDealer
     * @param uOMName
     * @param itemImgPath
     * @param mainGroupId
     * @param itemMinimum
     * @param itemDCRate
     * @param itemMRP
     * @param itemBrandId
     * @param itemDeleted
     * @param itemName
     * @param itemDistributor
     * @param mainGroupSortNo
     * @param itemItypeId
     * @param itemId
     * @param mainGroupName
     * @param mainGroupRemarks
     * @param itemCategoryId
     * @param itemActRate
     * @param stockStatus
     * @param itemCases
     * @param itemMaximum
     * @param mainGroupImgPath
     * @param active
     * @param itemUOMId
     * @param itemSRate
     */
    public Example(String itemId, String itemName, String itemItypeId, String itemUOMId, String uOMName, String itemBrandId, String itemCategoryId, String itemTaxId, String itemMRP, String stockStatus, String itemDistributor, String itemDealer, String itemSRate, String itemDCRate, String itemReorder, String itemMinimum, String itemMaximum, String itemDeleted, String itemCases, String itemActRate, String itemImgPath, String itemDescriptions, String mainGroupId, String mainGroupName, String mainGroupSortNo, Object mainGroupTemplate, Object mainGroupRemarks, String active, String mainGroupImgPath) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemItypeId = itemItypeId;
        this.itemUOMId = itemUOMId;
        this.uOMName = uOMName;
        this.itemBrandId = itemBrandId;
        this.itemCategoryId = itemCategoryId;
        this.itemTaxId = itemTaxId;
        this.itemMRP = itemMRP;
        this.stockStatus = stockStatus;
        this.itemDistributor = itemDistributor;
        this.itemDealer = itemDealer;
        this.itemSRate = itemSRate;
        this.itemDCRate = itemDCRate;
        this.itemReorder = itemReorder;
        this.itemMinimum = itemMinimum;
        this.itemMaximum = itemMaximum;
        this.itemDeleted = itemDeleted;
        this.itemCases = itemCases;
        this.itemActRate = itemActRate;
        this.itemImgPath = itemImgPath;
        this.itemDescriptions = itemDescriptions;
        this.mainGroupId = mainGroupId;
        this.mainGroupName = mainGroupName;
        this.mainGroupSortNo = mainGroupSortNo;
        this.mainGroupTemplate = mainGroupTemplate;
        this.mainGroupRemarks = mainGroupRemarks;
        this.active = active;
        this.mainGroupImgPath = mainGroupImgPath;
    }

    /**
     * @return The itemId
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * @param itemId The Item_Id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * @return The itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName The Item_Name
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return The itemItypeId
     */
    public String getItemItypeId() {
        return itemItypeId;
    }

    /**
     * @param itemItypeId The Item_ItypeId
     */
    public void setItemItypeId(String itemItypeId) {
        this.itemItypeId = itemItypeId;
    }

    /**
     * @return The itemUOMId
     */
    public String getItemUOMId() {
        return itemUOMId;
    }

    /**
     * @param itemUOMId The Item_UOMId
     */
    public void setItemUOMId(String itemUOMId) {
        this.itemUOMId = itemUOMId;
    }

    /**
     * @return The uOMName
     */
    public String getUOMName() {
        return uOMName;
    }

    /**
     * @param uOMName The UOM_Name
     */
    public void setUOMName(String uOMName) {
        this.uOMName = uOMName;
    }

    /**
     * @return The itemBrandId
     */
    public String getItemBrandId() {
        return itemBrandId;
    }

    /**
     * @param itemBrandId The Item_BrandId
     */
    public void setItemBrandId(String itemBrandId) {
        this.itemBrandId = itemBrandId;
    }

    /**
     * @return The itemCategoryId
     */
    public String getItemCategoryId() {
        return itemCategoryId;
    }

    /**
     * @param itemCategoryId The Item_CategoryId
     */
    public void setItemCategoryId(String itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
    }

    /**
     * @return The itemTaxId
     */
    public String getItemTaxId() {
        return itemTaxId;
    }

    /**
     * @param itemTaxId The Item_Tax_Id
     */
    public void setItemTaxId(String itemTaxId) {
        this.itemTaxId = itemTaxId;
    }

    /**
     * @return The itemMRP
     */
    public String getItemMRP() {
        return itemMRP;
    }

    /**
     * @param itemMRP The Item_MRP
     */
    public void setItemMRP(String itemMRP) {
        this.itemMRP = itemMRP;
    }

    /**
     * @return The stockStatus
     */
    public String getStockStatus() {
        return stockStatus;
    }

    /**
     * @param stockStatus The Stock_Status
     */
    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    /**
     * @return The itemDistributor
     */
    public String getItemDistributor() {
        return itemDistributor;
    }

    /**
     * @param itemDistributor The Item_distributor
     */
    public void setItemDistributor(String itemDistributor) {
        this.itemDistributor = itemDistributor;
    }

    /**
     * @return The itemDealer
     */
    public String getItemDealer() {
        return itemDealer;
    }

    /**
     * @param itemDealer The Item_Dealer
     */
    public void setItemDealer(String itemDealer) {
        this.itemDealer = itemDealer;
    }

    /**
     * @return The itemSRate
     */
    public String getItemSRate() {
        return itemSRate;
    }

    /**
     * @param itemSRate The Item_SRate
     */
    public void setItemSRate(String itemSRate) {
        this.itemSRate = itemSRate;
    }

    /**
     * @return The itemDCRate
     */
    public String getItemDCRate() {
        return itemDCRate;
    }

    /**
     * @param itemDCRate The Item_DCRate
     */
    public void setItemDCRate(String itemDCRate) {
        this.itemDCRate = itemDCRate;
    }

    /**
     * @return The itemReorder
     */
    public String getItemReorder() {
        return itemReorder;
    }

    /**
     * @param itemReorder The Item_Reorder
     */
    public void setItemReorder(String itemReorder) {
        this.itemReorder = itemReorder;
    }

    /**
     * @return The itemMinimum
     */
    public String getItemMinimum() {
        return itemMinimum;
    }

    /**
     * @param itemMinimum The Item_Minimum
     */
    public void setItemMinimum(String itemMinimum) {
        this.itemMinimum = itemMinimum;
    }

    /**
     * @return The itemMaximum
     */
    public String getItemMaximum() {
        return itemMaximum;
    }

    /**
     * @param itemMaximum The Item_Maximum
     */
    public void setItemMaximum(String itemMaximum) {
        this.itemMaximum = itemMaximum;
    }

    /**
     * @return The itemDeleted
     */
    public String getItemDeleted() {
        return itemDeleted;
    }

    /**
     * @param itemDeleted The Item_Deleted
     */
    public void setItemDeleted(String itemDeleted) {
        this.itemDeleted = itemDeleted;
    }

    /**
     * @return The itemCases
     */
    public String getItemCases() {
        return itemCases;
    }

    /**
     * @param itemCases The Item_Cases
     */
    public void setItemCases(String itemCases) {
        this.itemCases = itemCases;
    }

    /**
     * @return The itemActRate
     */
    public String getItemActRate() {
        return itemActRate;
    }

    /**
     * @param itemActRate The Item_ActRate
     */
    public void setItemActRate(String itemActRate) {
        this.itemActRate = itemActRate;
    }

    /**
     * @return The itemImgPath
     */
    public String getItemImgPath() {
        return itemImgPath;
    }

    /**
     * @param itemImgPath The Item_ImgPath
     */
    public void setItemImgPath(String itemImgPath) {
        this.itemImgPath = itemImgPath;
    }

    /**
     * @return The itemDescriptions
     */
    public String getItemDescriptions() {
        return itemDescriptions;
    }

    /**
     * @param itemDescriptions The Item_Descriptions
     */
    public void setItemDescriptions(String itemDescriptions) {
        this.itemDescriptions = itemDescriptions;
    }

    /**
     * @return The mainGroupId
     */
    public String getMainGroupId() {
        return mainGroupId;
    }

    /**
     * @param mainGroupId The MainGroup_Id
     */
    public void setMainGroupId(String mainGroupId) {
        this.mainGroupId = mainGroupId;
    }

    /**
     * @return The mainGroupName
     */
    public String getMainGroupName() {
        return mainGroupName;
    }

    /**
     * @param mainGroupName The MainGroup_Name
     */
    public void setMainGroupName(String mainGroupName) {
        this.mainGroupName = mainGroupName;
    }

    /**
     * @return The mainGroupSortNo
     */
    public String getMainGroupSortNo() {
        return mainGroupSortNo;
    }

    /**
     * @param mainGroupSortNo The MainGroup_SortNo
     */
    public void setMainGroupSortNo(String mainGroupSortNo) {
        this.mainGroupSortNo = mainGroupSortNo;
    }

    /**
     * @return The mainGroupTemplate
     */
    public Object getMainGroupTemplate() {
        return mainGroupTemplate;
    }

    /**
     * @param mainGroupTemplate The MainGroup_Template
     */
    public void setMainGroupTemplate(Object mainGroupTemplate) {
        this.mainGroupTemplate = mainGroupTemplate;
    }

    /**
     * @return The mainGroupRemarks
     */
    public Object getMainGroupRemarks() {
        return mainGroupRemarks;
    }

    /**
     * @param mainGroupRemarks The MainGroup_Remarks
     */
    public void setMainGroupRemarks(Object mainGroupRemarks) {
        this.mainGroupRemarks = mainGroupRemarks;
    }

    /**
     * @return The active
     */
    public String getActive() {
        return active;
    }

    /**
     * @param active The Active
     */
    public void setActive(String active) {
        this.active = active;
    }

    /**
     * @return The mainGroupImgPath
     */
    public String getMainGroupImgPath() {
        return mainGroupImgPath;
    }

    /**
     * @param mainGroupImgPath The MainGroup_ImgPath
     */
    public void setMainGroupImgPath(String mainGroupImgPath) {
        this.mainGroupImgPath = mainGroupImgPath;
    }

}
