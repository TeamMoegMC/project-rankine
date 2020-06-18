package com.cannolicatfish.rankine.util;

import com.cannolicatfish.rankine.util.elements.*;
import com.sun.jna.platform.mac.Carbon;

import java.util.Arrays;
import java.util.List;

public final class PeriodicTableUtils {

    public final List<String> names = Arrays.asList("None","Hydrogen","Helium","Lithium","Beryllium","Boron","Carbon","Nitrogen ","Oxygen","Flourine","Neon","Sodium","Magnesium","Aluminum","Silicon","Phosphorus","Sulfur","Chlorine",
            "Argon", "Potassium","Calcium","Scandium", "Titanium","Vanadium","Chromium","Manganese","Iron","Cobalt","Nickel","Copper","Zinc","Gallium","Germanium","Arsenic","Selenium","Bromine","Krypton","Rubidium","Strontium",
            "Yttrium", "Zirconium","Niobium","Molybdenum", "Technetium","Ruthenium","Rhodium","Palladium","Silver","Cadmium","Indium","Tin","Antimony","Tellurium","Iodine","Xenon","Cesium","Barium","Lanthanum","Cerium",
            "Praseodymium", "Neodymium","Promethium","Samarium", "Europium","Gadolinium","Tebrium","Dysprosium","Holmium","Eribium","Thulium","Ytterbium","Lutetium","Hafnium","Tantalum","Tungsten","Rhenium","Osmium","Iridium",
            "Platinum","Gold", "Mercury","Thalium","Lead","Bismuth", "Polonium","Astatine","Radon","Francium","Radium","Actinium","Thorium","Proactinium","Uranium","Neptunium","Plutonium ","Americium","Curium","Berkelium",
            "Californium","Einsteinium", "Fermium","Mendelevium","Nobelium", "Lawrencium","Rutherfordium","Dubnium","Seaborgium","Bohrium","Hassium","Meiterium","Darmstadtium","Roentgenium","Copernicium","Nihonium","Flerovium",
            "Moscovium","Livermorium", "Tennessine","Oganesson"); //Index 0 for all lists are "None" and should not be used or appear

    public final List<String> symbols = Arrays.asList("","H","He","Li","Be","B","C","N","O","F","Ne","Na","Mg","Al","Si","P","S","Cl","Ar","K","Ca","Sc","Ti","V","Cr","Mn","Fe","Co","Ni","Cu","Zn","Ga","Ge","As","Se","Br","Kr","Rb",
            "Sr","Y","Zr","Nb","Mo","Tc","Ru","Rh","Pd","Ag","Cd","In","Sn","Sb","Te","I","Xe","Cs","Ba","La","Ce","Pr","Nd","pm","Sm","Eu","Gd","Tb","Dy","Ho","Er","Tm","Yb","Lu","Hf","Ta","W","Re","Os ","Ir","Pt","Au","Hg","Tl",
            "Pb","Bi","Po","At","Rn","Fr","Ra","Ac","Th","Pa","U","Np","Pu","Am","Cm","Bk","Cf","Es","Fm","md","No","Lr","Rf","Db","Sg","Bh","Hs","Mt","Ds","Rg","Cn","Uut","Ft","Uup","Lv","Uus","Uuo");

    public List<String> getElementNames() {
        return names;
    }

    public List<String> getElementSymbols() {
        return symbols;
    }

    public String getElementbyNumber(int x, Boolean symbol)
    {
        if (symbol)
        {
            return symbols.get(x);
        }
        else
        {
            return names.get(x);
        }
    }

    public String getElementNameBySymbol(String symbol)
    {
        int index = symbols.indexOf(symbol);
        return names.get(index);
    }

    public Element getElementBySymbol(String symbol)
    {
        for (Element i: Element.values())
        {
            if (i.symbol.contains(symbol))
            {
                return i;
            }
        }
        return null;
    }

    public String getElementByMaterial(String material)
    {
        if (material.equals("none") || material.equals("nope"))
        {
            return "";
        }
        if (material.equals("pure_carbon"))
        {
            return "C";
        }
        int index = 0;
        for (String e:names)
        {
            if (material.equalsIgnoreCase(e))
            {
                return symbols.get(index);
            }
            index++;
        }
        return "";
    }

    public int calcDurability(List<Element> elements, List<Integer> percents)
    {
        int index = 0;
        int durability = 0;
        for (Element e: elements)
        {
            durability += e.element.getDurabilityFromPercent(percents.get(index));
            index++;
        }

        return durability;
    }

    public float calcMiningSpeed(List<Element> elements, List<Integer> percents)
    {
        int index = 0;
        float miningSpeed = 0f;
        for (Element e: elements)
        {
            miningSpeed += e.element.getMiningSpeedFromPercent(percents.get(index));
            index++;
        }

        return miningSpeed;
    }

    public int calcEnchantability(List<Element> elements, List<Integer> percents)
    {
        int index = 0;
        int enchant = 0;
        for (Element e: elements)
        {
            enchant += e.element.getEnchantabilityFromPercent(percents.get(index));
            index++;
        }

        return enchant;
    }

    public enum Element {
        CARBON(6,"C",new CarbonElement()),
        ALUMINUM(13, "Al", new AluminumElement()),
        SULFUR(16,"S",new SulfurElement()),
        MANGANESE(25, "Mn", new ManganeseElement()),
        IRON(26, "Fe", new IronElement()),
        NICKEL(28,"Ni", new NickelElement()),
        COPPER(29, "Cu", new CopperElement()),
        ZINC(30, "Zn", new ZincElement()),
        TIN(50, "Sn", new TinElement()),
        GOLD(79, "Au", new GoldElement());

        public final int atomicNumber;
        public final String symbol;
        public final ElementInterface element;



        private Element(int atomicNumber, String symbol, ElementInterface element)
        {
            this.atomicNumber = atomicNumber;
            this.symbol = symbol;
            this.element = element;
        }

    }
}