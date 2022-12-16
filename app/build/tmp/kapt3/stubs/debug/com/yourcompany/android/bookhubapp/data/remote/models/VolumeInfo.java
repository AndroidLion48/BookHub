package com.yourcompany.android.bookhubapp.data.remote.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b:\b\u0086\b\u0018\u00002\u00020\u0001B\u00c3\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u00a2\u0006\u0002\u0010 J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0006H\u00c6\u0003J\t\u0010@\u001a\u00020\u0006H\u00c6\u0003J\t\u0010A\u001a\u00020\u0006H\u00c6\u0003J\t\u0010B\u001a\u00020\u0015H\u00c6\u0003J\t\u0010C\u001a\u00020\u0017H\u00c6\u0003J\t\u0010D\u001a\u00020\u0006H\u00c6\u0003J\t\u0010E\u001a\u00020\u0006H\u00c6\u0003J\t\u0010F\u001a\u00020\u0006H\u00c6\u0003J\t\u0010G\u001a\u00020\u0006H\u00c6\u0003J\t\u0010H\u001a\u00020\u0015H\u00c6\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\t\u0010J\u001a\u00020\u001eH\u00c6\u0003J\t\u0010K\u001a\u00020\u0006H\u00c6\u0003J\t\u0010L\u001a\u00020\bH\u00c6\u0003J\t\u0010M\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010O\u001a\u00020\u0006H\u00c6\u0003J\t\u0010P\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005H\u00c6\u0003J\u00f1\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010T\u001a\u00020\u00032\b\u0010U\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010V\u001a\u00020\u0015H\u00d6\u0001J\t\u0010W\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0011\u0010\f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0011\u0010\u0012\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0018\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u0011\u0010\u0019\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0011\u0010\u001a\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0011\u0010\u001b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010(R\u0011\u0010\u001c\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00103R\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u001f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010(\u00a8\u0006X"}, d2 = {"Lcom/yourcompany/android/bookhubapp/data/remote/models/VolumeInfo;", "", "allowAnonLogging", "", "authors", "", "", "averageRating", "", "canonicalVolumeLink", "categories", "contentVersion", "description", "imageLinks", "Lcom/yourcompany/android/bookhubapp/data/remote/models/ImageLinks;", "industryIdentifiers", "Lcom/yourcompany/android/bookhubapp/data/remote/models/IndustryIdentifier;", "infoLink", "language", "maturityRating", "pageCount", "", "panelizationSummary", "Lcom/yourcompany/android/bookhubapp/data/remote/models/PanelizationSummary;", "previewLink", "printType", "publishedDate", "publisher", "ratingsCount", "readingModes", "Lcom/yourcompany/android/bookhubapp/data/remote/models/ReadingModes;", "title", "(ZLjava/util/List;FLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/yourcompany/android/bookhubapp/data/remote/models/ImageLinks;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/yourcompany/android/bookhubapp/data/remote/models/PanelizationSummary;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/yourcompany/android/bookhubapp/data/remote/models/ReadingModes;Ljava/lang/String;)V", "getAllowAnonLogging", "()Z", "getAuthors", "()Ljava/util/List;", "getAverageRating", "()F", "getCanonicalVolumeLink", "()Ljava/lang/String;", "getCategories", "getContentVersion", "getDescription", "getImageLinks", "()Lcom/yourcompany/android/bookhubapp/data/remote/models/ImageLinks;", "getIndustryIdentifiers", "getInfoLink", "getLanguage", "getMaturityRating", "getPageCount", "()I", "getPanelizationSummary", "()Lcom/yourcompany/android/bookhubapp/data/remote/models/PanelizationSummary;", "getPreviewLink", "getPrintType", "getPublishedDate", "getPublisher", "getRatingsCount", "getReadingModes", "()Lcom/yourcompany/android/bookhubapp/data/remote/models/ReadingModes;", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class VolumeInfo {
    private final boolean allowAnonLogging = false;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> authors = null;
    private final float averageRating = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String canonicalVolumeLink = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> categories = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String contentVersion = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable()
    private final com.yourcompany.android.bookhubapp.data.remote.models.ImageLinks imageLinks = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.yourcompany.android.bookhubapp.data.remote.models.IndustryIdentifier> industryIdentifiers = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String infoLink = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String language = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String maturityRating = null;
    private final int pageCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.yourcompany.android.bookhubapp.data.remote.models.PanelizationSummary panelizationSummary = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String previewLink = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String printType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String publishedDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String publisher = null;
    private final int ratingsCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.yourcompany.android.bookhubapp.data.remote.models.ReadingModes readingModes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.yourcompany.android.bookhubapp.data.remote.models.VolumeInfo copy(boolean allowAnonLogging, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> authors, float averageRating, @org.jetbrains.annotations.NotNull()
    java.lang.String canonicalVolumeLink, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> categories, @org.jetbrains.annotations.NotNull()
    java.lang.String contentVersion, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    com.yourcompany.android.bookhubapp.data.remote.models.ImageLinks imageLinks, @org.jetbrains.annotations.NotNull()
    java.util.List<com.yourcompany.android.bookhubapp.data.remote.models.IndustryIdentifier> industryIdentifiers, @org.jetbrains.annotations.NotNull()
    java.lang.String infoLink, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    java.lang.String maturityRating, int pageCount, @org.jetbrains.annotations.NotNull()
    com.yourcompany.android.bookhubapp.data.remote.models.PanelizationSummary panelizationSummary, @org.jetbrains.annotations.NotNull()
    java.lang.String previewLink, @org.jetbrains.annotations.NotNull()
    java.lang.String printType, @org.jetbrains.annotations.NotNull()
    java.lang.String publishedDate, @org.jetbrains.annotations.NotNull()
    java.lang.String publisher, int ratingsCount, @org.jetbrains.annotations.NotNull()
    com.yourcompany.android.bookhubapp.data.remote.models.ReadingModes readingModes, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public VolumeInfo(boolean allowAnonLogging, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> authors, float averageRating, @org.jetbrains.annotations.NotNull()
    java.lang.String canonicalVolumeLink, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> categories, @org.jetbrains.annotations.NotNull()
    java.lang.String contentVersion, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    com.yourcompany.android.bookhubapp.data.remote.models.ImageLinks imageLinks, @org.jetbrains.annotations.NotNull()
    java.util.List<com.yourcompany.android.bookhubapp.data.remote.models.IndustryIdentifier> industryIdentifiers, @org.jetbrains.annotations.NotNull()
    java.lang.String infoLink, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    java.lang.String maturityRating, int pageCount, @org.jetbrains.annotations.NotNull()
    com.yourcompany.android.bookhubapp.data.remote.models.PanelizationSummary panelizationSummary, @org.jetbrains.annotations.NotNull()
    java.lang.String previewLink, @org.jetbrains.annotations.NotNull()
    java.lang.String printType, @org.jetbrains.annotations.NotNull()
    java.lang.String publishedDate, @org.jetbrains.annotations.NotNull()
    java.lang.String publisher, int ratingsCount, @org.jetbrains.annotations.NotNull()
    com.yourcompany.android.bookhubapp.data.remote.models.ReadingModes readingModes, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getAllowAnonLogging() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getAuthors() {
        return null;
    }
    
    public final float component3() {
        return 0.0F;
    }
    
    public final float getAverageRating() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCanonicalVolumeLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContentVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.yourcompany.android.bookhubapp.data.remote.models.ImageLinks component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.yourcompany.android.bookhubapp.data.remote.models.ImageLinks getImageLinks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yourcompany.android.bookhubapp.data.remote.models.IndustryIdentifier> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yourcompany.android.bookhubapp.data.remote.models.IndustryIdentifier> getIndustryIdentifiers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInfoLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMaturityRating() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getPageCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yourcompany.android.bookhubapp.data.remote.models.PanelizationSummary component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yourcompany.android.bookhubapp.data.remote.models.PanelizationSummary getPanelizationSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPreviewLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrintType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPublishedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPublisher() {
        return null;
    }
    
    public final int component19() {
        return 0;
    }
    
    public final int getRatingsCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yourcompany.android.bookhubapp.data.remote.models.ReadingModes component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yourcompany.android.bookhubapp.data.remote.models.ReadingModes getReadingModes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
}