package com.rest.employee.entity;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.*;

@JsonSerialize(using = JsonSerializer.class)
public class CountryInfo implements Serializable{

    public Name name;
    public List<String> tld;
    public String cca2;
    public String ccn3;
    public String cca3;
    public String cioc;
    public boolean independent;
    public String status;
    public boolean unMember;
    public Map<String, Currencies> currencies;
    public Idd idd;
    public List<String> capital;
    public List<String> altSpellings;
    public String region;
    public String subregion;
    public Map<String, String> languages;
    public Map<String, Translations> translations;
    public List<Double> latlng;
    public boolean landlocked;
    public List<String> borders;
    public double area;
    public Map<String, Demonyms> demonyms;
    public String flag;
    public Maps maps;
    public int population;
    public Map<String, Double> gini;
    public String fifa;
    public Car car;
    public List<String> timezones;
    public List<String> continents;
    public Flags flags;
    public CoatOfArms coatOfArms;
    public String startOfWeek;
    public CapitalInfo capitalInfo;
    public PostalCode postalCode;

    // Getters and Setters

    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    // Handle dynamic fields using @JsonAnySetter
    @JsonAnySetter
    public void handleUnknownField(String fieldName, Object value) {
        // Handle any unknown fields here if needed
    }

    public static class Name {
        public String common;
        public String official;
        public Map<String, Map<String, String>> nativeName;

        // Getters and Setters

        public String getCommon() {
            return common;
        }

        public void setCommon(String common) {
            this.common = common;
        }

        public String getOfficial() {
            return official;
        }

        public void setOfficial(String official) {
            this.official = official;
        }

        public Map<String, Map<String, String>> getNativeName() {
            return nativeName;
        }

        public void setNativeName(Map<String, Map<String, String>> nativeName) {
            this.nativeName = nativeName;
        }
    }

    public static class Currencies {
        public String name;
        public String symbol;

        // Getters and Setters

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }
    }

    public static class Idd {
        public String root;
        public List<String> suffixes;

        // Getters and Setters

        public String getRoot() {
            return root;
        }

        public void setRoot(String root) {
            this.root = root;
        }

        public List<String> getSuffixes() {
            return suffixes;
        }

        public void setSuffixes(List<String> suffixes) {
            this.suffixes = suffixes;
        }
    }

    public static class Translations {
        // Define your Translation class structure here
    }

    public static class Demonyms {
        // Define your Demonym class structure here
    }

    public static class Maps {
        public String googleMaps;
        public String openStreetMaps;

        // Getters and Setters


        public String getGoogleMaps() {
            return googleMaps;
        }

        public void setGoogleMaps(String googleMaps) {
            this.googleMaps = googleMaps;
        }

        public String getOpenStreetMaps() {
            return openStreetMaps;
        }

        public void setOpenStreetMaps(String openStreetMaps) {
            this.openStreetMaps = openStreetMaps;
        }
    }

    public static class Car {
        public List<String> signs;
        public String side;

        // Getters and Setters

        public List<String> getSigns() {
            return signs;
        }

        public void setSigns(List<String> signs) {
            this.signs = signs;
        }

        public String getSide() {
            return side;
        }

        public void setSide(String side) {
            this.side = side;
        }
    }

    public static class Flags {
        public String png;
        public String svg;
        public String alt;

        // Getters and Setters

        public String getPng() {
            return png;
        }

        public void setPng(String png) {
            this.png = png;
        }

        public String getSvg() {
            return svg;
        }

        public void setSvg(String svg) {
            this.svg = svg;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }
    }

    public static class CoatOfArms {
        public String png;
        public String svg;

        // Getters and Setters

        public String getPng() {
            return png;
        }

        public void setPng(String png) {
            this.png = png;
        }

        public String getSvg() {
            return svg;
        }

        public void setSvg(String svg) {
            this.svg = svg;
        }
    }

    public static class CapitalInfo {
        public List<Double> latlng;

        // Getters and Setters

        public List<Double> getLatlng() {
            return latlng;
        }

        public void setLatlng(List<Double> latlng) {
            this.latlng = latlng;
        }
    }

    public static class PostalCode {
        public String format;
        public String regex;

        // Getters and Setters

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public String getRegex() {
            return regex;
        }

        public void setRegex(String regex) {
            this.regex = regex;
        }
    }

    public CountryInfo() {
    }

    public CountryInfo(Name name, List<String> tld, String cca2, String ccn3, String cca3, String cioc, boolean independent, String status, boolean unMember, Map<String, Currencies> currencies, Idd idd, List<String> capital, List<String> altSpellings, String region, String subregion, Map<String, String> languages, Map<String, Translations> translations, List<Double> latlng, boolean landlocked, List<String> borders, double area, Map<String, Demonyms> demonyms, String flag, Maps maps, int population, Map<String, Double> gini, String fifa, Car car, List<String> timezones, List<String> continents, Flags flags, CoatOfArms coatOfArms, String startOfWeek, CapitalInfo capitalInfo, PostalCode postalCode) {
        this.name = name;
        this.tld = tld;
        this.cca2 = cca2;
        this.ccn3 = ccn3;
        this.cca3 = cca3;
        this.cioc = cioc;
        this.independent = independent;
        this.status = status;
        this.unMember = unMember;
        this.currencies = currencies;
        this.idd = idd;
        this.capital = capital;
        this.altSpellings = altSpellings;
        this.region = region;
        this.subregion = subregion;
        this.languages = languages;
        this.translations = translations;
        this.latlng = latlng;
        this.landlocked = landlocked;
        this.borders = borders;
        this.area = area;
        this.demonyms = demonyms;
        this.flag = flag;
        this.maps = maps;
        this.population = population;
        this.gini = gini;
        this.fifa = fifa;
        this.car = car;
        this.timezones = timezones;
        this.continents = continents;
        this.flags = flags;
        this.coatOfArms = coatOfArms;
        this.startOfWeek = startOfWeek;
        this.capitalInfo = capitalInfo;
        this.postalCode = postalCode;
    }

    public List<String> getTld() {
        return tld;
    }

    public void setTld(List<String> tld) {
        this.tld = tld;
    }

    public int getCca2() {
        return cca2;
    }

    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    public String getCcn3() {
        return ccn3;
    }

    public void setCcn3(String ccn3) {
        this.ccn3 = ccn3;
    }

    public String getCca3() {
        return cca3;
    }

    public void setCca3(String cca3) {
        this.cca3 = cca3;
    }

    public String getCioc() {
        return cioc;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    public boolean isIndependent() {
        return independent;
    }

    public void setIndependent(boolean independent) {
        this.independent = independent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isUnMember() {
        return unMember;
    }

    public void setUnMember(boolean unMember) {
        this.unMember = unMember;
    }

    public Map<String, Currencies> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Map<String, Currencies> currencies) {
        this.currencies = currencies;
    }

    public Idd getIdd() {
        return idd;
    }

    public void setIdd(Idd idd) {
        this.idd = idd;
    }

    public List<String> getCapital() {
        return capital;
    }

    public void setCapital(List<String> capital) {
        this.capital = capital;
    }

    public List<String> getAltSpellings() {
        return altSpellings;
    }

    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public Map<String, String> getLanguages() {
        return languages;
    }

    public void setLanguages(Map<String, String> languages) {
        this.languages = languages;
    }

    public Map<String, Translations> getTranslations() {
        return translations;
    }

    public void setTranslations(Map<String, Translations> translations) {
        this.translations = translations;
    }

    public List<Double> getLatlng() {
        return latlng;
    }

    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    public boolean isLandlocked() {
        return landlocked;
    }

    public void setLandlocked(boolean landlocked) {
        this.landlocked = landlocked;
    }

    public List<String> getBorders() {
        return borders;
    }

    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Map<String, Demonyms> getDemonyms() {
        return demonyms;
    }

    public void setDemonyms(Map<String, Demonyms> demonyms) {
        this.demonyms = demonyms;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Maps getMaps() {
        return maps;
    }

    public void setMaps(Maps maps) {
        this.maps = maps;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Map<String, Double> getGini() {
        return gini;
    }

    public void setGini(Map<String, Double> gini) {
        this.gini = gini;
    }

    public String getFifa() {
        return fifa;
    }

    public void setFifa(String fifa) {
        this.fifa = fifa;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<String> getTimezones() {
        return timezones;
    }

    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    public List<String> getContinents() {
        return continents;
    }

    public void setContinents(List<String> continents) {
        this.continents = continents;
    }

    public Flags getFlags() {
        return flags;
    }

    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    public CoatOfArms getCoatOfArms() {
        return coatOfArms;
    }

    public void setCoatOfArms(CoatOfArms coatOfArms) {
        this.coatOfArms = coatOfArms;
    }

    public String getStartOfWeek() {
        return startOfWeek;
    }

    public void setStartOfWeek(String startOfWeek) {
        this.startOfWeek = startOfWeek;
    }

    public CapitalInfo getCapitalInfo() {
        return capitalInfo;
    }

    public void setCapitalInfo(CapitalInfo capitalInfo) {
        this.capitalInfo = capitalInfo;
    }

    public PostalCode getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(PostalCode postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "CountryInfo{" +
                "name=" + name +
                ", tld=" + tld +
                ", cca2='" + cca2 + '\'' +
                ", ccn3='" + ccn3 + '\'' +
                ", cca3='" + cca3 + '\'' +
                ", cioc='" + cioc + '\'' +
                ", independent=" + independent +
                ", status='" + status + '\'' +
                ", unMember=" + unMember +
                ", currencies=" + currencies +
                ", idd=" + idd +
                ", capital=" + capital +
                ", altSpellings=" + altSpellings +
                ", region='" + region + '\'' +
                ", subregion='" + subregion + '\'' +
                ", languages=" + languages +
                ", translations=" + translations +
                ", latlng=" + latlng +
                ", landlocked=" + landlocked +
                ", borders=" + borders +
                ", area=" + area +
                ", demonyms=" + demonyms +
                ", flag='" + flag + '\'' +
                ", maps=" + maps +
                ", population=" + population +
                ", gini=" + gini +
                ", fifa='" + fifa + '\'' +
                ", car=" + car +
                ", timezones=" + timezones +
                ", continents=" + continents +
                ", flags=" + flags +
                ", coatOfArms=" + coatOfArms +
                ", startOfWeek='" + startOfWeek + '\'' +
                ", capitalInfo=" + capitalInfo +
                ", postalCode=" + postalCode +
                '}';
    }
}

