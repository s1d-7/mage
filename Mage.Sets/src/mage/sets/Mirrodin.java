package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

public class Mirrodin extends ExpansionSet {

    private static final Mirrodin instance = new Mirrodin();

    public static Mirrodin getInstance() {
        return instance;
    }

    private Mirrodin() {
        super("Mirrodin", "MRD", ExpansionSet.buildDate(2003, 9, 2), SetType.EXPANSION);
        this.blockName = "Mirrodin";
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Aether Spellbomb", 141, Rarity.COMMON, mage.cards.a.AetherSpellbomb.class));
        cards.add(new SetCardInfo("Alpha Myr", 142, Rarity.COMMON, mage.cards.a.AlphaMyr.class));
        cards.add(new SetCardInfo("Altar of Shadows", 143, Rarity.RARE, mage.cards.a.AltarOfShadows.class));
        cards.add(new SetCardInfo("Altar's Light", 1, Rarity.UNCOMMON, mage.cards.a.AltarsLight.class));
        cards.add(new SetCardInfo("Ancient Den", 278, Rarity.COMMON, mage.cards.a.AncientDen.class));
        cards.add(new SetCardInfo("Annul", 29, Rarity.COMMON, mage.cards.a.Annul.class));
        cards.add(new SetCardInfo("Arc-Slogger", 85, Rarity.RARE, mage.cards.a.ArcSlogger.class));
        cards.add(new SetCardInfo("Arrest", 2, Rarity.COMMON, mage.cards.a.Arrest.class));
        cards.add(new SetCardInfo("Assert Authority", 30, Rarity.UNCOMMON, mage.cards.a.AssertAuthority.class));
        cards.add(new SetCardInfo("Atog", 86, Rarity.UNCOMMON, mage.cards.a.Atog.class));
        cards.add(new SetCardInfo("Auriok Bladewarden", 3, Rarity.UNCOMMON, mage.cards.a.AuriokBladewarden.class));
        cards.add(new SetCardInfo("Auriok Steelshaper", 4, Rarity.RARE, mage.cards.a.AuriokSteelshaper.class));
        cards.add(new SetCardInfo("Auriok Transfixer", 5, Rarity.COMMON, mage.cards.a.AuriokTransfixer.class));
        cards.add(new SetCardInfo("Awe Strike", 6, Rarity.COMMON, mage.cards.a.AweStrike.class));
        cards.add(new SetCardInfo("Banshee's Blade", 144, Rarity.UNCOMMON, mage.cards.b.BansheesBlade.class));
        cards.add(new SetCardInfo("Barter in Blood", 57, Rarity.UNCOMMON, mage.cards.b.BarterInBlood.class));
        cards.add(new SetCardInfo("Battlegrowth", 113, Rarity.COMMON, mage.cards.b.Battlegrowth.class));
        cards.add(new SetCardInfo("Betrayal of Flesh", 58, Rarity.UNCOMMON, mage.cards.b.BetrayalOfFlesh.class));
        cards.add(new SetCardInfo("Blinding Beam", 7, Rarity.COMMON, mage.cards.b.BlindingBeam.class));
        cards.add(new SetCardInfo("Blinkmoth Urn", 145, Rarity.RARE, mage.cards.b.BlinkmothUrn.class));
        cards.add(new SetCardInfo("Blinkmoth Well", 279, Rarity.UNCOMMON, mage.cards.b.BlinkmothWell.class));
        cards.add(new SetCardInfo("Bloodscent", 114, Rarity.UNCOMMON, mage.cards.b.Bloodscent.class));
        cards.add(new SetCardInfo("Bonesplitter", 146, Rarity.COMMON, mage.cards.b.Bonesplitter.class));
        cards.add(new SetCardInfo("Bosh, Iron Golem", 147, Rarity.RARE, mage.cards.b.BoshIronGolem.class));
        cards.add(new SetCardInfo("Bottle Gnomes", 148, Rarity.UNCOMMON, mage.cards.b.BottleGnomes.class));
        cards.add(new SetCardInfo("Broodstar", 31, Rarity.RARE, mage.cards.b.Broodstar.class));
        cards.add(new SetCardInfo("Brown Ouphe", 115, Rarity.UNCOMMON, mage.cards.b.BrownOuphe.class));
        cards.add(new SetCardInfo("Cathodion", 149, Rarity.UNCOMMON, mage.cards.c.Cathodion.class));
        cards.add(new SetCardInfo("Chalice of the Void", 150, Rarity.RARE, mage.cards.c.ChaliceOfTheVoid.class));
        cards.add(new SetCardInfo("Chimney Imp", 59, Rarity.COMMON, mage.cards.c.ChimneyImp.class));
        cards.add(new SetCardInfo("Chromatic Sphere", 151, Rarity.COMMON, mage.cards.c.ChromaticSphere.class));
        cards.add(new SetCardInfo("Chrome Mox", 152, Rarity.RARE, mage.cards.c.ChromeMox.class));
        cards.add(new SetCardInfo("Clockwork Beetle", 153, Rarity.COMMON, mage.cards.c.ClockworkBeetle.class));
        cards.add(new SetCardInfo("Clockwork Condor", 154, Rarity.COMMON, mage.cards.c.ClockworkCondor.class));
        cards.add(new SetCardInfo("Clockwork Dragon", 155, Rarity.RARE, mage.cards.c.ClockworkDragon.class));
        cards.add(new SetCardInfo("Clockwork Vorrac", 156, Rarity.UNCOMMON, mage.cards.c.ClockworkVorrac.class));
        cards.add(new SetCardInfo("Cloudpost", 280, Rarity.COMMON, mage.cards.c.Cloudpost.class));
        cards.add(new SetCardInfo("Cobalt Golem", 157, Rarity.COMMON, mage.cards.c.CobaltGolem.class));
        cards.add(new SetCardInfo("Confusion in the Ranks", 87, Rarity.RARE, mage.cards.c.ConfusionInTheRanks.class));
        cards.add(new SetCardInfo("Consume Spirit", 60, Rarity.COMMON, mage.cards.c.ConsumeSpirit.class));
        cards.add(new SetCardInfo("Contaminated Bond", 61, Rarity.COMMON, mage.cards.c.ContaminatedBond.class));
        cards.add(new SetCardInfo("Copperhoof Vorrac", 116, Rarity.RARE, mage.cards.c.CopperhoofVorrac.class));
        cards.add(new SetCardInfo("Copper Myr", 158, Rarity.COMMON, mage.cards.c.CopperMyr.class));
        cards.add(new SetCardInfo("Creeping Mold", 117, Rarity.UNCOMMON, mage.cards.c.CreepingMold.class));
        cards.add(new SetCardInfo("Crystal Shard", 159, Rarity.UNCOMMON, mage.cards.c.CrystalShard.class));
        cards.add(new SetCardInfo("Culling Scales", 160, Rarity.RARE, mage.cards.c.CullingScales.class));
        cards.add(new SetCardInfo("Damping Matrix", 161, Rarity.RARE, mage.cards.d.DampingMatrix.class));
        cards.add(new SetCardInfo("Deconstruct", 118, Rarity.COMMON, mage.cards.d.Deconstruct.class));
        cards.add(new SetCardInfo("Detonate", 88, Rarity.UNCOMMON, mage.cards.d.Detonate.class));
        cards.add(new SetCardInfo("Disarm", 32, Rarity.COMMON, mage.cards.d.Disarm.class));
        cards.add(new SetCardInfo("Disciple of the Vault", 62, Rarity.COMMON, mage.cards.d.DiscipleOfTheVault.class));
        cards.add(new SetCardInfo("Domineer", 33, Rarity.UNCOMMON, mage.cards.d.Domineer.class));
        cards.add(new SetCardInfo("Dragon Blood", 163, Rarity.UNCOMMON, mage.cards.d.DragonBlood.class));
        cards.add(new SetCardInfo("Dream's Grip", 34, Rarity.COMMON, mage.cards.d.DreamsGrip.class));
        cards.add(new SetCardInfo("Dross Harvester", 63, Rarity.RARE, mage.cards.d.DrossHarvester.class));
        cards.add(new SetCardInfo("Dross Prowler", 64, Rarity.COMMON, mage.cards.d.DrossProwler.class));
        cards.add(new SetCardInfo("Dross Scorpion", 164, Rarity.COMMON, mage.cards.d.DrossScorpion.class));
        cards.add(new SetCardInfo("Duplicant", 165, Rarity.RARE, mage.cards.d.Duplicant.class));
        cards.add(new SetCardInfo("Duskworker", 166, Rarity.UNCOMMON, mage.cards.d.Duskworker.class));
        cards.add(new SetCardInfo("Electrostatic Bolt", 89, Rarity.COMMON, mage.cards.e.ElectrostaticBolt.class));
        cards.add(new SetCardInfo("Elf Replica", 167, Rarity.COMMON, mage.cards.e.ElfReplica.class));
        cards.add(new SetCardInfo("Empyrial Plate", 168, Rarity.RARE, mage.cards.e.EmpyrialPlate.class));
        cards.add(new SetCardInfo("Extraplanar Lens", 169, Rarity.RARE, mage.cards.e.ExtraplanarLens.class));
        cards.add(new SetCardInfo("Fabricate", 35, Rarity.UNCOMMON, mage.cards.f.Fabricate.class));
        cards.add(new SetCardInfo("Fangren Hunter", 119, Rarity.COMMON, mage.cards.f.FangrenHunter.class));
        cards.add(new SetCardInfo("Farsight Mask", 170, Rarity.UNCOMMON, mage.cards.f.FarsightMask.class));
        cards.add(new SetCardInfo("Fatespinner", 36, Rarity.RARE, mage.cards.f.Fatespinner.class));
        cards.add(new SetCardInfo("Fiery Gambit", 90, Rarity.RARE, mage.cards.f.FieryGambit.class));
        cards.add(new SetCardInfo("Fireshrieker", 171, Rarity.UNCOMMON, mage.cards.f.Fireshrieker.class));
        cards.add(new SetCardInfo("Fists of the Anvil", 91, Rarity.COMMON, mage.cards.f.FistsOfTheAnvil.class));
        cards.add(new SetCardInfo("Forest", 303, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 304, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 305, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 306, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forge Armor", 92, Rarity.UNCOMMON, mage.cards.f.ForgeArmor.class));
        cards.add(new SetCardInfo("Frogmite", 172, Rarity.COMMON, mage.cards.f.Frogmite.class));
        cards.add(new SetCardInfo("Galvanic Key", 173, Rarity.COMMON, mage.cards.g.GalvanicKey.class));
        cards.add(new SetCardInfo("Gate to the Aether", 174, Rarity.RARE, mage.cards.g.GateToTheAether.class));
        cards.add(new SetCardInfo("Gilded Lotus", 175, Rarity.RARE, mage.cards.g.GildedLotus.class));
        cards.add(new SetCardInfo("Glimmervoid", 281, Rarity.RARE, mage.cards.g.Glimmervoid.class));
        cards.add(new SetCardInfo("Glissa Sunseeker", 120, Rarity.RARE, mage.cards.g.GlissaSunseeker.class));
        cards.add(new SetCardInfo("Goblin Charbelcher", 176, Rarity.RARE, mage.cards.g.GoblinCharbelcher.class));
        cards.add(new SetCardInfo("Goblin Dirigible", 177, Rarity.UNCOMMON, mage.cards.g.GoblinDirigible.class));
        cards.add(new SetCardInfo("Goblin Replica", 178, Rarity.COMMON, mage.cards.g.GoblinReplica.class));
        cards.add(new SetCardInfo("Goblin Striker", 94, Rarity.COMMON, mage.cards.g.GoblinStriker.class));
        cards.add(new SetCardInfo("Goblin War Wagon", 179, Rarity.COMMON, mage.cards.g.GoblinWarWagon.class));
        cards.add(new SetCardInfo("Gold Myr", 180, Rarity.COMMON, mage.cards.g.GoldMyr.class));
        cards.add(new SetCardInfo("Golem-Skin Gauntlets", 181, Rarity.UNCOMMON, mage.cards.g.GolemSkinGauntlets.class));
        cards.add(new SetCardInfo("Grab the Reins", 95, Rarity.UNCOMMON, mage.cards.g.GrabTheReins.class));
        cards.add(new SetCardInfo("Granite Shard", 182, Rarity.UNCOMMON, mage.cards.g.GraniteShard.class));
        cards.add(new SetCardInfo("Great Furnace", 282, Rarity.COMMON, mage.cards.g.GreatFurnace.class));
        cards.add(new SetCardInfo("Grid Monitor", 183, Rarity.RARE, mage.cards.g.GridMonitor.class));
        cards.add(new SetCardInfo("Groffskithur", 121, Rarity.COMMON, mage.cards.g.Groffskithur.class));
        cards.add(new SetCardInfo("Heartwood Shard", 184, Rarity.UNCOMMON, mage.cards.h.HeartwoodShard.class));
        cards.add(new SetCardInfo("Hematite Golem", 185, Rarity.COMMON, mage.cards.h.HematiteGolem.class));
        cards.add(new SetCardInfo("Hum of the Radix", 122, Rarity.RARE, mage.cards.h.HumOfTheRadix.class));
        cards.add(new SetCardInfo("Icy Manipulator", 186, Rarity.UNCOMMON, mage.cards.i.IcyManipulator.class));
        cards.add(new SetCardInfo("Incite War", 96, Rarity.COMMON, mage.cards.i.InciteWar.class));
        cards.add(new SetCardInfo("Inertia Bubble", 37, Rarity.COMMON, mage.cards.i.InertiaBubble.class));
        cards.add(new SetCardInfo("Iron Myr", 187, Rarity.COMMON, mage.cards.i.IronMyr.class));
        cards.add(new SetCardInfo("Irradiate", 67, Rarity.COMMON, mage.cards.i.Irradiate.class));
        cards.add(new SetCardInfo("Island", 291, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 292, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 293, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 294, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Isochron Scepter", 188, Rarity.UNCOMMON, mage.cards.i.IsochronScepter.class));
        cards.add(new SetCardInfo("Jinxed Choker", 189, Rarity.RARE, mage.cards.j.JinxedChoker.class));
        cards.add(new SetCardInfo("Journey of Discovery", 123, Rarity.COMMON, mage.cards.j.JourneyOfDiscovery.class));
        cards.add(new SetCardInfo("Krark-Clan Grunt", 97, Rarity.COMMON, mage.cards.k.KrarkClanGrunt.class));
        cards.add(new SetCardInfo("Krark-Clan Shaman", 98, Rarity.COMMON, mage.cards.k.KrarkClanShaman.class));
        cards.add(new SetCardInfo("Krark's Thumb", 190, Rarity.RARE, mage.cards.k.KrarksThumb.class));
        cards.add(new SetCardInfo("Leaden Myr", 191, Rarity.COMMON, mage.cards.l.LeadenMyr.class));
        cards.add(new SetCardInfo("Leonin Abunas", 8, Rarity.RARE, mage.cards.l.LeoninAbunas.class));
        cards.add(new SetCardInfo("Leonin Bladetrap", 192, Rarity.UNCOMMON, mage.cards.l.LeoninBladetrap.class));
        cards.add(new SetCardInfo("Leonin Den-Guard", 9, Rarity.COMMON, mage.cards.l.LeoninDenGuard.class));
        cards.add(new SetCardInfo("Leonin Elder", 10, Rarity.COMMON, mage.cards.l.LeoninElder.class));
        cards.add(new SetCardInfo("Leonin Scimitar", 193, Rarity.COMMON, mage.cards.l.LeoninScimitar.class));
        cards.add(new SetCardInfo("Leonin Skyhunter", 11, Rarity.UNCOMMON, mage.cards.l.LeoninSkyhunter.class));
        cards.add(new SetCardInfo("Leonin Sun Standard", 194, Rarity.RARE, mage.cards.l.LeoninSunStandard.class));
        cards.add(new SetCardInfo("Leveler", 195, Rarity.RARE, mage.cards.l.Leveler.class));
        cards.add(new SetCardInfo("Lifespark Spellbomb", 197, Rarity.COMMON, mage.cards.l.LifesparkSpellbomb.class));
        cards.add(new SetCardInfo("Lightning Coils", 198, Rarity.RARE, mage.cards.l.LightningCoils.class));
        cards.add(new SetCardInfo("Lightning Greaves", 199, Rarity.UNCOMMON, mage.cards.l.LightningGreaves.class));
        cards.add(new SetCardInfo("Living Hive", 124, Rarity.RARE, mage.cards.l.LivingHive.class));
        cards.add(new SetCardInfo("Lodestone Myr", 200, Rarity.RARE, mage.cards.l.LodestoneMyr.class));
        cards.add(new SetCardInfo("Looming Hoverguard", 38, Rarity.UNCOMMON, mage.cards.l.LoomingHoverguard.class));
        cards.add(new SetCardInfo("Loxodon Mender", 12, Rarity.COMMON, mage.cards.l.LoxodonMender.class));
        cards.add(new SetCardInfo("Loxodon Punisher", 14, Rarity.RARE, mage.cards.l.LoxodonPunisher.class));
        cards.add(new SetCardInfo("Loxodon Warhammer", 201, Rarity.UNCOMMON, mage.cards.l.LoxodonWarhammer.class));
        cards.add(new SetCardInfo("Lumengrid Sentinel", 40, Rarity.UNCOMMON, mage.cards.l.LumengridSentinel.class));
        cards.add(new SetCardInfo("Lumengrid Warden", 41, Rarity.COMMON, mage.cards.l.LumengridWarden.class));
        cards.add(new SetCardInfo("Luminous Angel", 15, Rarity.RARE, mage.cards.l.LuminousAngel.class));
        cards.add(new SetCardInfo("Malachite Golem", 202, Rarity.COMMON, mage.cards.m.MalachiteGolem.class));
        cards.add(new SetCardInfo("March of the Machines", 42, Rarity.RARE, mage.cards.m.MarchOfTheMachines.class));
        cards.add(new SetCardInfo("Mask of Memory", 203, Rarity.UNCOMMON, mage.cards.m.MaskOfMemory.class));
        cards.add(new SetCardInfo("Mass Hysteria", 99, Rarity.RARE, mage.cards.m.MassHysteria.class));
        cards.add(new SetCardInfo("Megatog", 100, Rarity.RARE, mage.cards.m.Megatog.class));
        cards.add(new SetCardInfo("Mesmeric Orb", 204, Rarity.RARE, mage.cards.m.MesmericOrb.class));
        cards.add(new SetCardInfo("Mind's Eye", 205, Rarity.RARE, mage.cards.m.MindsEye.class));
        cards.add(new SetCardInfo("Mindslaver", 206, Rarity.RARE, mage.cards.m.Mindslaver.class));
        cards.add(new SetCardInfo("Mindstorm Crown", 207, Rarity.UNCOMMON, mage.cards.m.MindstormCrown.class));
        cards.add(new SetCardInfo("Molder Slug", 125, Rarity.RARE, mage.cards.m.MolderSlug.class));
        cards.add(new SetCardInfo("Molten Rain", 101, Rarity.COMMON, mage.cards.m.MoltenRain.class));
        cards.add(new SetCardInfo("Moriok Scavenger", 68, Rarity.COMMON, mage.cards.m.MoriokScavenger.class));
        cards.add(new SetCardInfo("Mountain", 299, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 300, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 301, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 302, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Myr Adapter", 210, Rarity.COMMON, mage.cards.m.MyrAdapter.class));
        cards.add(new SetCardInfo("Myr Enforcer", 211, Rarity.COMMON, mage.cards.m.MyrEnforcer.class));
        cards.add(new SetCardInfo("Myr Incubator", 212, Rarity.RARE, mage.cards.m.MyrIncubator.class));
        cards.add(new SetCardInfo("Myr Mindservant", 213, Rarity.UNCOMMON, mage.cards.m.MyrMindservant.class));
        cards.add(new SetCardInfo("Myr Retriever", 215, Rarity.UNCOMMON, mage.cards.m.MyrRetriever.class));
        cards.add(new SetCardInfo("Necrogen Mists", 69, Rarity.RARE, mage.cards.n.NecrogenMists.class));
        cards.add(new SetCardInfo("Necrogen Spellbomb", 216, Rarity.COMMON, mage.cards.n.NecrogenSpellbomb.class));
        cards.add(new SetCardInfo("Needlebug", 217, Rarity.UNCOMMON, mage.cards.n.Needlebug.class));
        cards.add(new SetCardInfo("Neurok Familiar", 43, Rarity.COMMON, mage.cards.n.NeurokFamiliar.class));
        cards.add(new SetCardInfo("Neurok Hoversail", 218, Rarity.COMMON, mage.cards.n.NeurokHoversail.class));
        cards.add(new SetCardInfo("Neurok Spy", 44, Rarity.COMMON, mage.cards.n.NeurokSpy.class));
        cards.add(new SetCardInfo("Nightmare Lash", 219, Rarity.RARE, mage.cards.n.NightmareLash.class));
        cards.add(new SetCardInfo("Nim Devourer", 70, Rarity.RARE, mage.cards.n.NimDevourer.class));
        cards.add(new SetCardInfo("Nim Lasher", 71, Rarity.COMMON, mage.cards.n.NimLasher.class));
        cards.add(new SetCardInfo("Nim Replica", 220, Rarity.COMMON, mage.cards.n.NimReplica.class));
        cards.add(new SetCardInfo("Nim Shambler", 72, Rarity.UNCOMMON, mage.cards.n.NimShambler.class));
        cards.add(new SetCardInfo("Nim Shrieker", 73, Rarity.COMMON, mage.cards.n.NimShrieker.class));
        cards.add(new SetCardInfo("Nuisance Engine", 221, Rarity.UNCOMMON, mage.cards.n.NuisanceEngine.class));
        cards.add(new SetCardInfo("Oblivion Stone", 222, Rarity.RARE, mage.cards.o.OblivionStone.class));
        cards.add(new SetCardInfo("Ogre Leadfoot", 102, Rarity.COMMON, mage.cards.o.OgreLeadfoot.class));
        cards.add(new SetCardInfo("Omega Myr", 223, Rarity.COMMON, mage.cards.o.OmegaMyr.class));
        cards.add(new SetCardInfo("One Dozen Eyes", 126, Rarity.UNCOMMON, mage.cards.o.OneDozenEyes.class));
        cards.add(new SetCardInfo("Ornithopter", 224, Rarity.UNCOMMON, mage.cards.o.Ornithopter.class));
        cards.add(new SetCardInfo("Override", 45, Rarity.COMMON, mage.cards.o.OverrideCard.class));
        cards.add(new SetCardInfo("Pearl Shard", 225, Rarity.UNCOMMON, mage.cards.p.PearlShard.class));
        cards.add(new SetCardInfo("Pentavus", 226, Rarity.RARE, mage.cards.p.Pentavus.class));
        cards.add(new SetCardInfo("Pewter Golem", 227, Rarity.COMMON, mage.cards.p.PewterGolem.class));
        cards.add(new SetCardInfo("Plains", 287, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 288, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 289, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 290, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plated Slagwurm", 127, Rarity.RARE, mage.cards.p.PlatedSlagwurm.class));
        cards.add(new SetCardInfo("Platinum Angel", 228, Rarity.RARE, mage.cards.p.PlatinumAngel.class));
        cards.add(new SetCardInfo("Power Conduit", 229, Rarity.UNCOMMON, mage.cards.p.PowerConduit.class));
        cards.add(new SetCardInfo("Predator's Strike", 128, Rarity.COMMON, mage.cards.p.PredatorsStrike.class));
        cards.add(new SetCardInfo("Promise of Power", 74, Rarity.RARE, mage.cards.p.PromiseOfPower.class));
        cards.add(new SetCardInfo("Proteus Staff", 230, Rarity.RARE, mage.cards.p.ProteusStaff.class));
        cards.add(new SetCardInfo("Psychic Membrane", 46, Rarity.UNCOMMON, mage.cards.p.PsychicMembrane.class));
        cards.add(new SetCardInfo("Psychogenic Probe", 231, Rarity.RARE, mage.cards.p.PsychogenicProbe.class));
        cards.add(new SetCardInfo("Pyrite Spellbomb", 232, Rarity.COMMON, mage.cards.p.PyriteSpellbomb.class));
        cards.add(new SetCardInfo("Quicksilver Elemental", 47, Rarity.RARE, mage.cards.q.QuicksilverElemental.class));
        cards.add(new SetCardInfo("Quicksilver Fountain", 233, Rarity.RARE, mage.cards.q.QuicksilverFountain.class));
        cards.add(new SetCardInfo("Raise the Alarm", 16, Rarity.COMMON, mage.cards.r.RaiseTheAlarm.class));
        cards.add(new SetCardInfo("Razor Barrier", 17, Rarity.COMMON, mage.cards.r.RazorBarrier.class));
        cards.add(new SetCardInfo("Regress", 48, Rarity.COMMON, mage.cards.r.Regress.class));
        cards.add(new SetCardInfo("Reiver Demon", 75, Rarity.RARE, mage.cards.r.ReiverDemon.class));
        cards.add(new SetCardInfo("Relic Bane", 76, Rarity.UNCOMMON, mage.cards.r.RelicBane.class));
        cards.add(new SetCardInfo("Roar of the Kha", 18, Rarity.UNCOMMON, mage.cards.r.RoarOfTheKha.class));
        cards.add(new SetCardInfo("Rule of Law", 19, Rarity.RARE, mage.cards.r.RuleOfLaw.class));
        cards.add(new SetCardInfo("Rust Elemental", 234, Rarity.UNCOMMON, mage.cards.r.RustElemental.class));
        cards.add(new SetCardInfo("Rustmouth Ogre", 103, Rarity.UNCOMMON, mage.cards.r.RustmouthOgre.class));
        cards.add(new SetCardInfo("Rustspore Ram", 235, Rarity.UNCOMMON, mage.cards.r.RustsporeRam.class));
        cards.add(new SetCardInfo("Scale of Chiss-Goria", 236, Rarity.COMMON, mage.cards.s.ScaleOfChissGoria.class));
        cards.add(new SetCardInfo("Scrabbling Claws", 237, Rarity.UNCOMMON, mage.cards.s.ScrabblingClaws.class));
        cards.add(new SetCardInfo("Sculpting Steel", 238, Rarity.RARE, mage.cards.s.SculptingSteel.class));
        cards.add(new SetCardInfo("Scythe of the Wretched", 239, Rarity.RARE, mage.cards.s.ScytheOfTheWretched.class));
        cards.add(new SetCardInfo("Seat of the Synod", 283, Rarity.COMMON, mage.cards.s.SeatOfTheSynod.class));
        cards.add(new SetCardInfo("Second Sunrise", 20, Rarity.RARE, mage.cards.s.SecondSunrise.class));
        cards.add(new SetCardInfo("Seething Song", 104, Rarity.COMMON, mage.cards.s.SeethingSong.class));
        cards.add(new SetCardInfo("Serum Tank", 240, Rarity.UNCOMMON, mage.cards.s.SerumTank.class));
        cards.add(new SetCardInfo("Shared Fate", 49, Rarity.RARE, mage.cards.s.SharedFate.class));
        cards.add(new SetCardInfo("Shatter", 105, Rarity.COMMON, mage.cards.s.Shatter.class));
        cards.add(new SetCardInfo("Shrapnel Blast", 106, Rarity.UNCOMMON, mage.cards.s.ShrapnelBlast.class));
        cards.add(new SetCardInfo("Silver Myr", 241, Rarity.COMMON, mage.cards.s.SilverMyr.class));
        cards.add(new SetCardInfo("Skeleton Shard", 242, Rarity.UNCOMMON, mage.cards.s.SkeletonShard.class));
        cards.add(new SetCardInfo("Skyhunter Cub", 21, Rarity.COMMON, mage.cards.s.SkyhunterCub.class));
        cards.add(new SetCardInfo("Skyhunter Patrol", 22, Rarity.COMMON, mage.cards.s.SkyhunterPatrol.class));
        cards.add(new SetCardInfo("Slagwurm Armor", 243, Rarity.COMMON, mage.cards.s.SlagwurmArmor.class));
        cards.add(new SetCardInfo("Slith Ascendant", 23, Rarity.UNCOMMON, mage.cards.s.SlithAscendant.class));
        cards.add(new SetCardInfo("Slith Bloodletter", 77, Rarity.UNCOMMON, mage.cards.s.SlithBloodletter.class));
        cards.add(new SetCardInfo("Slith Firewalker", 107, Rarity.UNCOMMON, mage.cards.s.SlithFirewalker.class));
        cards.add(new SetCardInfo("Slith Predator", 129, Rarity.UNCOMMON, mage.cards.s.SlithPredator.class));
        cards.add(new SetCardInfo("Slith Strider", 50, Rarity.UNCOMMON, mage.cards.s.SlithStrider.class));
        cards.add(new SetCardInfo("Solar Tide", 24, Rarity.RARE, mage.cards.s.SolarTide.class));
        cards.add(new SetCardInfo("Soldier Replica", 244, Rarity.COMMON, mage.cards.s.SoldierReplica.class));
        cards.add(new SetCardInfo("Solemn Simulacrum", 245, Rarity.RARE, mage.cards.s.SolemnSimulacrum.class));
        cards.add(new SetCardInfo("Somber Hoverguard", 51, Rarity.COMMON, mage.cards.s.SomberHoverguard.class));
        cards.add(new SetCardInfo("Soul Foundry", 246, Rarity.RARE, mage.cards.s.SoulFoundry.class));
        cards.add(new SetCardInfo("Soul Nova", 25, Rarity.UNCOMMON, mage.cards.s.SoulNova.class));
        cards.add(new SetCardInfo("Spellweaver Helix", 247, Rarity.RARE, mage.cards.s.SpellweaverHelix.class));
        cards.add(new SetCardInfo("Spikeshot Goblin", 108, Rarity.COMMON, mage.cards.s.SpikeshotGoblin.class));
        cards.add(new SetCardInfo("Spoils of the Vault", 78, Rarity.RARE, mage.cards.s.SpoilsOfTheVault.class));
        cards.add(new SetCardInfo("Stalking Stones", 284, Rarity.UNCOMMON, mage.cards.s.StalkingStones.class));
        cards.add(new SetCardInfo("Steel Wall", 248, Rarity.COMMON, mage.cards.s.SteelWall.class));
        cards.add(new SetCardInfo("Sunbeam Spellbomb", 250, Rarity.COMMON, mage.cards.s.SunbeamSpellbomb.class));
        cards.add(new SetCardInfo("Sun Droplet", 249, Rarity.UNCOMMON, mage.cards.s.SunDroplet.class));
        cards.add(new SetCardInfo("Swamp", 295, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 296, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 297, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 298, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sword of Kaldra", 251, Rarity.RARE, mage.cards.s.SwordOfKaldra.class));
        cards.add(new SetCardInfo("Sylvan Scrying", 130, Rarity.UNCOMMON, mage.cards.s.SylvanScrying.class));
        cards.add(new SetCardInfo("Synod Sanctum", 252, Rarity.UNCOMMON, mage.cards.s.SynodSanctum.class));
        cards.add(new SetCardInfo("Taj-Nar Swordsmith", 27, Rarity.UNCOMMON, mage.cards.t.TajNarSwordsmith.class));
        cards.add(new SetCardInfo("Talisman of Dominance", 253, Rarity.UNCOMMON, mage.cards.t.TalismanOfDominance.class));
        cards.add(new SetCardInfo("Talisman of Impulse", 254, Rarity.UNCOMMON, mage.cards.t.TalismanOfImpulse.class));
        cards.add(new SetCardInfo("Talisman of Indulgence", 255, Rarity.UNCOMMON, mage.cards.t.TalismanOfIndulgence.class));
        cards.add(new SetCardInfo("Talisman of Progress", 256, Rarity.UNCOMMON, mage.cards.t.TalismanOfProgress.class));
        cards.add(new SetCardInfo("Talisman of Unity", 257, Rarity.UNCOMMON, mage.cards.t.TalismanOfUnity.class));
        cards.add(new SetCardInfo("Tanglebloom", 258, Rarity.COMMON, mage.cards.t.Tanglebloom.class));
        cards.add(new SetCardInfo("Tangleroot", 259, Rarity.RARE, mage.cards.t.Tangleroot.class));
        cards.add(new SetCardInfo("Tel-Jilad Archers", 131, Rarity.COMMON, mage.cards.t.TelJiladArchers.class));
        cards.add(new SetCardInfo("Tel-Jilad Chosen", 132, Rarity.COMMON, mage.cards.t.TelJiladChosen.class));
        cards.add(new SetCardInfo("Tel-Jilad Exile", 133, Rarity.COMMON, mage.cards.t.TelJiladExile.class));
        cards.add(new SetCardInfo("Tel-Jilad Stylus", 260, Rarity.UNCOMMON, mage.cards.t.TelJiladStylus.class));
        cards.add(new SetCardInfo("Tempest of Light", 28, Rarity.UNCOMMON, mage.cards.t.TempestOfLight.class));
        cards.add(new SetCardInfo("Temporal Cascade", 52, Rarity.RARE, mage.cards.t.TemporalCascade.class));
        cards.add(new SetCardInfo("Terror", 79, Rarity.COMMON, mage.cards.t.Terror.class));
        cards.add(new SetCardInfo("Thirst for Knowledge", 53, Rarity.UNCOMMON, mage.cards.t.ThirstForKnowledge.class));
        cards.add(new SetCardInfo("Thoughtcast", 54, Rarity.COMMON, mage.cards.t.Thoughtcast.class));
        cards.add(new SetCardInfo("Thought Prison", 261, Rarity.UNCOMMON, mage.cards.t.ThoughtPrison.class));
        cards.add(new SetCardInfo("Timesifter", 262, Rarity.RARE, mage.cards.t.Timesifter.class));
        cards.add(new SetCardInfo("Titanium Golem", 263, Rarity.COMMON, mage.cards.t.TitaniumGolem.class));
        cards.add(new SetCardInfo("Tooth and Nail", 134, Rarity.RARE, mage.cards.t.ToothAndNail.class));
        cards.add(new SetCardInfo("Tooth of Chiss-Goria", 264, Rarity.COMMON, mage.cards.t.ToothOfChissGoria.class));
        cards.add(new SetCardInfo("Tower of Champions", 265, Rarity.RARE, mage.cards.t.TowerOfChampions.class));
        cards.add(new SetCardInfo("Tower of Eons", 266, Rarity.RARE, mage.cards.t.TowerOfEons.class));
        cards.add(new SetCardInfo("Tower of Fortunes", 267, Rarity.RARE, mage.cards.t.TowerOfFortunes.class));
        cards.add(new SetCardInfo("Tower of Murmurs", 268, Rarity.RARE, mage.cards.t.TowerOfMurmurs.class));
        cards.add(new SetCardInfo("Trash for Treasure", 109, Rarity.RARE, mage.cards.t.TrashForTreasure.class));
        cards.add(new SetCardInfo("Tree of Tales", 285, Rarity.COMMON, mage.cards.t.TreeOfTales.class));
        cards.add(new SetCardInfo("Triskelion", 269, Rarity.RARE, mage.cards.t.Triskelion.class));
        cards.add(new SetCardInfo("Troll Ascetic", 135, Rarity.RARE, mage.cards.t.TrollAscetic.class));
        cards.add(new SetCardInfo("Trolls of Tel-Jilad", 136, Rarity.UNCOMMON, mage.cards.t.TrollsOfTelJilad.class));
        cards.add(new SetCardInfo("Turn to Dust", 137, Rarity.COMMON, mage.cards.t.TurnToDust.class));
        cards.add(new SetCardInfo("Vault of Whispers", 286, Rarity.COMMON, mage.cards.v.VaultOfWhispers.class));
        cards.add(new SetCardInfo("Vedalken Archmage", 55, Rarity.RARE, mage.cards.v.VedalkenArchmage.class));
        cards.add(new SetCardInfo("Vermiculos", 80, Rarity.RARE, mage.cards.v.Vermiculos.class));
        cards.add(new SetCardInfo("Viridian Joiner", 138, Rarity.COMMON, mage.cards.v.ViridianJoiner.class));
        cards.add(new SetCardInfo("Viridian Longbow", 270, Rarity.COMMON, mage.cards.v.ViridianLongbow.class));
        cards.add(new SetCardInfo("Viridian Shaman", 139, Rarity.UNCOMMON, mage.cards.v.ViridianShaman.class));
        cards.add(new SetCardInfo("Vorrac Battlehorns", 271, Rarity.COMMON, mage.cards.v.VorracBattlehorns.class));
        cards.add(new SetCardInfo("Vulshok Battlegear", 272, Rarity.UNCOMMON, mage.cards.v.VulshokBattlegear.class));
        cards.add(new SetCardInfo("Vulshok Battlemaster", 110, Rarity.RARE, mage.cards.v.VulshokBattlemaster.class));
        cards.add(new SetCardInfo("Vulshok Berserker", 111, Rarity.COMMON, mage.cards.v.VulshokBerserker.class));
        cards.add(new SetCardInfo("Vulshok Gauntlets", 273, Rarity.COMMON, mage.cards.v.VulshokGauntlets.class));
        cards.add(new SetCardInfo("Wail of the Nim", 81, Rarity.COMMON, mage.cards.w.WailOfTheNim.class));
        cards.add(new SetCardInfo("Wall of Blood", 82, Rarity.UNCOMMON, mage.cards.w.WallOfBlood.class));
        cards.add(new SetCardInfo("Wanderguard Sentry", 56, Rarity.COMMON, mage.cards.w.WanderguardSentry.class));
        cards.add(new SetCardInfo("War Elemental", 112, Rarity.RARE, mage.cards.w.WarElemental.class));
        cards.add(new SetCardInfo("Welding Jar", 274, Rarity.COMMON, mage.cards.w.WeldingJar.class));
        cards.add(new SetCardInfo("Wizard Replica", 275, Rarity.COMMON, mage.cards.w.WizardReplica.class));
        cards.add(new SetCardInfo("Woebearer", 83, Rarity.UNCOMMON, mage.cards.w.Woebearer.class));
        cards.add(new SetCardInfo("Worldslayer", 276, Rarity.RARE, mage.cards.w.Worldslayer.class));
        cards.add(new SetCardInfo("Wrench Mind", 84, Rarity.COMMON, mage.cards.w.WrenchMind.class));
        cards.add(new SetCardInfo("Wurmskin Forger", 140, Rarity.COMMON, mage.cards.w.WurmskinForger.class));
        cards.add(new SetCardInfo("Yotian Soldier", 277, Rarity.COMMON, mage.cards.y.YotianSoldier.class));
    }
}
