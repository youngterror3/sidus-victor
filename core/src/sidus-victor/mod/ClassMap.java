package sidus-victor.mod;

import arc.struct.*;
/** Generated class. Maps simple class names to concrete classes. For use in JSON mods. */
@SuppressWarnings("deprecation")
public class ClassMap{
    public static final ObjectMap<String, Class<?>> classes = new ObjectMap<>();
    
    static{
        classes.put("BuilderAI", sidus-victor.ai.types.BuilderAI.class);
        classes.put("DefenderAI", sidus-victor.ai.types.DefenderAI.class);
        classes.put("FlyingAI", sidus-victor.ai.types.FlyingAI.class);
        classes.put("FormationAI", sidus-victor.ai.types.FormationAI.class);
        classes.put("GroundAI", sidus-victor.ai.types.GroundAI.class);
        classes.put("HugAI", sidus-victor.ai.types.HugAI.class);
        classes.put("LogicAI", sidus-victor.ai.types.LogicAI.class);
        classes.put("MinerAI", sidus-victor.ai.types.MinerAI.class);
        classes.put("RepairAI", sidus-victor.ai.types.RepairAI.class);
        classes.put("SuicideAI", sidus-victor.ai.types.SuicideAI.class);
        classes.put("Ability", sidus-victor.entities.abilities.Ability.class);
        classes.put("EnergyFieldAbility", sidus-victor.entities.abilities.EnergyFieldAbility.class);
        classes.put("ForceFieldAbility", sidus-victor.entities.abilities.ForceFieldAbility.class);
        classes.put("MoveLightningAbility", sidus-victor.entities.abilities.MoveLightningAbility.class);
        classes.put("RepairFieldAbility", sidus-victor.entities.abilities.RepairFieldAbility.class);
        classes.put("ShieldRegenFieldAbility", sidus-victor.entities.abilities.ShieldRegenFieldAbility.class);
        classes.put("StatusFieldAbility", sidus-victor.entities.abilities.StatusFieldAbility.class);
        classes.put("UnitSpawnAbility", sidus-victor.entities.abilities.UnitSpawnAbility.class);
        classes.put("ArtilleryBulletType", sidus-victor.entities.bullet.ArtilleryBulletType.class);
        classes.put("BasicBulletType", sidus-victor.entities.bullet.BasicBulletType.class);
        classes.put("BombBulletType", sidus-victor.entities.bullet.BombBulletType.class);
        classes.put("BulletType", sidus-victor.entities.bullet.BulletType.class);
        classes.put("ContinuousLaserBulletType", sidus-victor.entities.bullet.ContinuousLaserBulletType.class);
        classes.put("EmpBulletType", sidus-victor.entities.bullet.EmpBulletType.class);
        classes.put("FireBulletType", sidus-victor.entities.bullet.FireBulletType.class);
        classes.put("FlakBulletType", sidus-victor.entities.bullet.FlakBulletType.class);
        classes.put("LaserBoltBulletType", sidus-victor.entities.bullet.LaserBoltBulletType.class);
        classes.put("LaserBulletType", sidus-victor.entities.bullet.LaserBulletType.class);
        classes.put("LightningBulletType", sidus-victor.entities.bullet.LightningBulletType.class);
        classes.put("LiquidBulletType", sidus-victor.entities.bullet.LiquidBulletType.class);
        classes.put("MassDriverBolt", sidus-victor.entities.bullet.MassDriverBolt.class);
        classes.put("MissileBulletType", sidus-victor.entities.bullet.MissileBulletType.class);
        classes.put("PointBulletType", sidus-victor.entities.bullet.PointBulletType.class);
        classes.put("RailBulletType", sidus-victor.entities.bullet.RailBulletType.class);
        classes.put("SapBulletType", sidus-victor.entities.bullet.SapBulletType.class);
        classes.put("ShrapnelBulletType", sidus-victor.entities.bullet.ShrapnelBulletType.class);
        classes.put("ExplosionEffect", sidus-victor.entities.effect.ExplosionEffect.class);
        classes.put("MultiEffect", sidus-victor.entities.effect.MultiEffect.class);
        classes.put("ParticleEffect", sidus-victor.entities.effect.ParticleEffect.class);
        classes.put("WaveEffect", sidus-victor.entities.effect.WaveEffect.class);
        classes.put("Objectives", sidus-victor.game.Objectives.class);
        classes.put("Objective", sidus-victor.game.Objectives.Objective.class);
        classes.put("Produce", sidus-victor.game.Objectives.Produce.class);
        classes.put("Research", sidus-victor.game.Objectives.Research.class);
        classes.put("SectorComplete", sidus-victor.game.Objectives.SectorComplete.class);
        classes.put("AmmoType", sidus-victor.type.AmmoType.class);
        classes.put("Category", sidus-victor.type.Category.class);
        classes.put("ErrorContent", sidus-victor.type.ErrorContent.class);
        classes.put("Item", sidus-victor.type.Item.class);
        classes.put("ItemSeq", sidus-victor.type.ItemSeq.class);
        classes.put("ItemStack", sidus-victor.type.ItemStack.class);
        classes.put("Liquid", sidus-victor.type.Liquid.class);
        classes.put("LiquidStack", sidus-victor.type.LiquidStack.class);
        classes.put("Planet", sidus-victor.type.Planet.class);
        classes.put("Publishable", sidus-victor.type.Publishable.class);
        classes.put("Satellite", sidus-victor.type.Satellite.class);
        classes.put("Sector", sidus-victor.type.Sector.class);
        classes.put("SectorRect", sidus-victor.type.Sector.SectorRect.class);
        classes.put("SectorPreset", sidus-victor.type.SectorPreset.class);
        classes.put("StatusEffect", sidus-victor.type.StatusEffect.class);
        classes.put("TransitionHandler", sidus-victor.type.StatusEffect.TransitionHandler.class);
        classes.put("UnitType", sidus-victor.type.UnitType.class);
        classes.put("Weapon", sidus-victor.type.Weapon.class);
        classes.put("Weather", sidus-victor.type.Weather.class);
        classes.put("WeatherEntry", sidus-victor.type.Weather.WeatherEntry.class);
        classes.put("ItemAmmoType", sidus-victor.type.ammo.ItemAmmoType.class);
        classes.put("PowerAmmoType", sidus-victor.type.ammo.PowerAmmoType.class);
        classes.put("PointDefenseWeapon", sidus-victor.type.weapons.PointDefenseWeapon.class);
        classes.put("RepairBeamWeapon", sidus-victor.type.weapons.RepairBeamWeapon.class);
        classes.put("HealBeamMount", sidus-victor.type.weapons.RepairBeamWeapon.HealBeamMount.class);
        classes.put("MagneticStorm", sidus-victor.type.weather.MagneticStorm.class);
        classes.put("ParticleWeather", sidus-victor.type.weather.ParticleWeather.class);
        classes.put("RainWeather", sidus-victor.type.weather.RainWeather.class);
        classes.put("SolarFlare", sidus-victor.type.weather.SolarFlare.class);
        classes.put("Attributes", sidus-victor.world.blocks.Attributes.class);
        classes.put("Autotiler", sidus-victor.world.blocks.Autotiler.class);
        classes.put("AutotilerHolder", sidus-victor.world.blocks.Autotiler.AutotilerHolder.class);
        classes.put("SliceMode", sidus-victor.world.blocks.Autotiler.SliceMode.class);
        classes.put("ConstructBlock", sidus-victor.world.blocks.ConstructBlock.class);
        classes.put("ConstructBuild", sidus-victor.world.blocks.ConstructBlock.ConstructBuild.class);
        classes.put("ControlBlock", sidus-victor.world.blocks.ControlBlock.class);
        classes.put("ItemSelection", sidus-victor.world.blocks.ItemSelection.class);
        classes.put("Accelerator", sidus-victor.world.blocks.campaign.Accelerator.class);
        classes.put("AcceleratorBuild", sidus-victor.world.blocks.campaign.Accelerator.AcceleratorBuild.class);
        classes.put("LaunchPad", sidus-victor.world.blocks.campaign.LaunchPad.class);
        classes.put("LaunchPadBuild", sidus-victor.world.blocks.campaign.LaunchPad.LaunchPadBuild.class);
        classes.put("Door", sidus-victor.world.blocks.defense.Door.class);
        classes.put("DoorBuild", sidus-victor.world.blocks.defense.Door.DoorBuild.class);
        classes.put("ForceProjector", sidus-victor.world.blocks.defense.ForceProjector.class);
        classes.put("ForceBuild", sidus-victor.world.blocks.defense.ForceProjector.ForceBuild.class);
        classes.put("MendProjector", sidus-victor.world.blocks.defense.MendProjector.class);
        classes.put("MendBuild", sidus-victor.world.blocks.defense.MendProjector.MendBuild.class);
        classes.put("OverdriveProjector", sidus-victor.world.blocks.defense.OverdriveProjector.class);
        classes.put("OverdriveBuild", sidus-victor.world.blocks.defense.OverdriveProjector.OverdriveBuild.class);
        classes.put("ShockMine", sidus-victor.world.blocks.defense.ShockMine.class);
        classes.put("ShockMineBuild", sidus-victor.world.blocks.defense.ShockMine.ShockMineBuild.class);
        classes.put("Thruster", sidus-victor.world.blocks.defense.Thruster.class);
        classes.put("ThrusterBuild", sidus-victor.world.blocks.defense.Thruster.ThrusterBuild.class);
        classes.put("Wall", sidus-victor.world.blocks.defense.Wall.class);
        classes.put("WallBuild", sidus-victor.world.blocks.defense.Wall.WallBuild.class);
        classes.put("BaseTurret", sidus-victor.world.blocks.defense.turrets.BaseTurret.class);
        classes.put("BaseTurretBuild", sidus-victor.world.blocks.defense.turrets.BaseTurret.BaseTurretBuild.class);
        classes.put("ItemTurret", sidus-victor.world.blocks.defense.turrets.ItemTurret.class);
        classes.put("ItemEntry", sidus-victor.world.blocks.defense.turrets.ItemTurret.ItemEntry.class);
        classes.put("ItemTurretBuild", sidus-victor.world.blocks.defense.turrets.ItemTurret.ItemTurretBuild.class);
        classes.put("LaserTurret", sidus-victor.world.blocks.defense.turrets.LaserTurret.class);
        classes.put("LaserTurretBuild", sidus-victor.world.blocks.defense.turrets.LaserTurret.LaserTurretBuild.class);
        classes.put("LiquidTurret", sidus-victor.world.blocks.defense.turrets.LiquidTurret.class);
        classes.put("LiquidTurretBuild", sidus-victor.world.blocks.defense.turrets.LiquidTurret.LiquidTurretBuild.class);
        classes.put("PointDefenseTurret", sidus-victor.world.blocks.defense.turrets.PointDefenseTurret.class);
        classes.put("PointDefenseBuild", sidus-victor.world.blocks.defense.turrets.PointDefenseTurret.PointDefenseBuild.class);
        classes.put("PowerTurret", sidus-victor.world.blocks.defense.turrets.PowerTurret.class);
        classes.put("PowerTurretBuild", sidus-victor.world.blocks.defense.turrets.PowerTurret.PowerTurretBuild.class);
        classes.put("ReloadTurret", sidus-victor.world.blocks.defense.turrets.ReloadTurret.class);
        classes.put("ReloadTurretBuild", sidus-victor.world.blocks.defense.turrets.ReloadTurret.ReloadTurretBuild.class);
        classes.put("TractorBeamTurret", sidus-victor.world.blocks.defense.turrets.TractorBeamTurret.class);
        classes.put("TractorBeamBuild", sidus-victor.world.blocks.defense.turrets.TractorBeamTurret.TractorBeamBuild.class);
        classes.put("Turret", sidus-victor.world.blocks.defense.turrets.Turret.class);
        classes.put("AmmoEntry", sidus-victor.world.blocks.defense.turrets.Turret.AmmoEntry.class);
        classes.put("TurretBuild", sidus-victor.world.blocks.defense.turrets.Turret.TurretBuild.class);
        classes.put("ArmoredConveyor", sidus-victor.world.blocks.distribution.ArmoredConveyor.class);
        classes.put("ArmoredConveyorBuild", sidus-victor.world.blocks.distribution.ArmoredConveyor.ArmoredConveyorBuild.class);
        classes.put("BufferedItemBridge", sidus-victor.world.blocks.distribution.BufferedItemBridge.class);
        classes.put("BufferedItemBridgeBuild", sidus-victor.world.blocks.distribution.BufferedItemBridge.BufferedItemBridgeBuild.class);
        classes.put("ChainedBuilding", sidus-victor.world.blocks.distribution.ChainedBuilding.class);
        classes.put("Conveyor", sidus-victor.world.blocks.distribution.Conveyor.class);
        classes.put("ConveyorBuild", sidus-victor.world.blocks.distribution.Conveyor.ConveyorBuild.class);
        classes.put("Duct", sidus-victor.world.blocks.distribution.Duct.class);
        classes.put("DuctBuild", sidus-victor.world.blocks.distribution.Duct.DuctBuild.class);
        classes.put("DuctBridge", sidus-victor.world.blocks.distribution.DuctBridge.class);
        classes.put("DuctBridgeBuild", sidus-victor.world.blocks.distribution.DuctBridge.DuctBridgeBuild.class);
        classes.put("DuctRouter", sidus-victor.world.blocks.distribution.DuctRouter.class);
        classes.put("DuctRouterBuild", sidus-victor.world.blocks.distribution.DuctRouter.DuctRouterBuild.class);
        classes.put("ExtendingItemBridge", sidus-victor.world.blocks.distribution.ExtendingItemBridge.class);
        classes.put("ExtendingItemBridgeBuild", sidus-victor.world.blocks.distribution.ExtendingItemBridge.ExtendingItemBridgeBuild.class);
        classes.put("ItemBridge", sidus-victor.world.blocks.distribution.ItemBridge.class);
        classes.put("ItemBridgeBuild", sidus-victor.world.blocks.distribution.ItemBridge.ItemBridgeBuild.class);
        classes.put("Junction", sidus-victor.world.blocks.distribution.Junction.class);
        classes.put("JunctionBuild", sidus-victor.world.blocks.distribution.Junction.JunctionBuild.class);
        classes.put("MassDriver", sidus-victor.world.blocks.distribution.MassDriver.class);
        classes.put("DriverBulletData", sidus-victor.world.blocks.distribution.MassDriver.DriverBulletData.class);
        classes.put("DriverState", sidus-victor.world.blocks.distribution.MassDriver.DriverState.class);
        classes.put("MassDriverBuild", sidus-victor.world.blocks.distribution.MassDriver.MassDriverBuild.class);
        classes.put("OverflowGate", sidus-victor.world.blocks.distribution.OverflowGate.class);
        classes.put("OverflowGateBuild", sidus-victor.world.blocks.distribution.OverflowGate.OverflowGateBuild.class);
        classes.put("PayloadConveyor", sidus-victor.world.blocks.distribution.PayloadConveyor.class);
        classes.put("PayloadConveyorBuild", sidus-victor.world.blocks.distribution.PayloadConveyor.PayloadConveyorBuild.class);
        classes.put("PayloadRouter", sidus-victor.world.blocks.distribution.PayloadRouter.class);
        classes.put("PayloadRouterBuild", sidus-victor.world.blocks.distribution.PayloadRouter.PayloadRouterBuild.class);
        classes.put("Router", sidus-victor.world.blocks.distribution.Router.class);
        classes.put("RouterBuild", sidus-victor.world.blocks.distribution.Router.RouterBuild.class);
        classes.put("Sorter", sidus-victor.world.blocks.distribution.Sorter.class);
        classes.put("SorterBuild", sidus-victor.world.blocks.distribution.Sorter.SorterBuild.class);
        classes.put("StackConveyor", sidus-victor.world.blocks.distribution.StackConveyor.class);
        classes.put("StackConveyorBuild", sidus-victor.world.blocks.distribution.StackConveyor.StackConveyorBuild.class);
        classes.put("AirBlock", sidus-victor.world.blocks.environment.AirBlock.class);
        classes.put("Bush", sidus-victor.world.blocks.environment.Bush.class);
        classes.put("Cliff", sidus-victor.world.blocks.environment.Cliff.class);
        classes.put("DoubleOverlayFloor", sidus-victor.world.blocks.environment.DoubleOverlayFloor.class);
        classes.put("EmptyFloor", sidus-victor.world.blocks.environment.EmptyFloor.class);
        classes.put("Floor", sidus-victor.world.blocks.environment.Floor.class);
        classes.put("OreBlock", sidus-victor.world.blocks.environment.OreBlock.class);
        classes.put("OverlayFloor", sidus-victor.world.blocks.environment.OverlayFloor.class);
        classes.put("Prop", sidus-victor.world.blocks.environment.Prop.class);
        classes.put("ShallowLiquid", sidus-victor.world.blocks.environment.ShallowLiquid.class);
        classes.put("SpawnBlock", sidus-victor.world.blocks.environment.SpawnBlock.class);
        classes.put("StaticClusterWall", sidus-victor.world.blocks.environment.StaticClusterWall.class);
        classes.put("StaticTree", sidus-victor.world.blocks.environment.StaticTree.class);
        classes.put("StaticWall", sidus-victor.world.blocks.environment.StaticWall.class);
        classes.put("TreeBlock", sidus-victor.world.blocks.environment.TreeBlock.class);
        classes.put("WallOreBlock", sidus-victor.world.blocks.environment.WallOreBlock.class);
        classes.put("WavingProp", sidus-victor.world.blocks.environment.WavingProp.class);
        classes.put("WobbleProp", sidus-victor.world.blocks.environment.WobbleProp.class);
        classes.put("BlockForge", sidus-victor.world.blocks.experimental.BlockForge.class);
        classes.put("BlockForgeBuild", sidus-victor.world.blocks.experimental.BlockForge.BlockForgeBuild.class);
        classes.put("BlockLoader", sidus-victor.world.blocks.experimental.BlockLoader.class);
        classes.put("BlockLoaderBuild", sidus-victor.world.blocks.experimental.BlockLoader.BlockLoaderBuild.class);
        classes.put("BlockUnloader", sidus-victor.world.blocks.experimental.BlockUnloader.class);
        classes.put("BlockUnloaderBuild", sidus-victor.world.blocks.experimental.BlockUnloader.BlockUnloaderBuild.class);
        classes.put("LegacyBlock", sidus-victor.world.blocks.legacy.LegacyBlock.class);
        classes.put("LegacyMechPad", sidus-victor.world.blocks.legacy.LegacyMechPad.class);
        classes.put("LegacyMechPadBuild", sidus-victor.world.blocks.legacy.LegacyMechPad.LegacyMechPadBuild.class);
        classes.put("LegacyUnitFactory", sidus-victor.world.blocks.legacy.LegacyUnitFactory.class);
        classes.put("LegacyUnitFactoryBuild", sidus-victor.world.blocks.legacy.LegacyUnitFactory.LegacyUnitFactoryBuild.class);
        classes.put("ArmoredConduit", sidus-victor.world.blocks.liquid.ArmoredConduit.class);
        classes.put("ArmoredConduitBuild", sidus-victor.world.blocks.liquid.ArmoredConduit.ArmoredConduitBuild.class);
        classes.put("Conduit", sidus-victor.world.blocks.liquid.Conduit.class);
        classes.put("ConduitBuild", sidus-victor.world.blocks.liquid.Conduit.ConduitBuild.class);
        classes.put("LiquidBlock", sidus-victor.world.blocks.liquid.LiquidBlock.class);
        classes.put("LiquidBuild", sidus-victor.world.blocks.liquid.LiquidBlock.LiquidBuild.class);
        classes.put("LiquidBridge", sidus-victor.world.blocks.liquid.LiquidBridge.class);
        classes.put("LiquidBridgeBuild", sidus-victor.world.blocks.liquid.LiquidBridge.LiquidBridgeBuild.class);
        classes.put("LiquidExtendingBridge", sidus-victor.world.blocks.liquid.LiquidExtendingBridge.class);
        classes.put("LiquidExtendingBridgeBuild", sidus-victor.world.blocks.liquid.LiquidExtendingBridge.LiquidExtendingBridgeBuild.class);
        classes.put("LiquidJunction", sidus-victor.world.blocks.liquid.LiquidJunction.class);
        classes.put("LiquidJunctionBuild", sidus-victor.world.blocks.liquid.LiquidJunction.LiquidJunctionBuild.class);
        classes.put("LiquidRouter", sidus-victor.world.blocks.liquid.LiquidRouter.class);
        classes.put("LiquidRouterBuild", sidus-victor.world.blocks.liquid.LiquidRouter.LiquidRouterBuild.class);
        classes.put("LogicBlock", sidus-victor.world.blocks.logic.LogicBlock.class);
        classes.put("LogicBuild", sidus-victor.world.blocks.logic.LogicBlock.LogicBuild.class);
        classes.put("LogicLink", sidus-victor.world.blocks.logic.LogicBlock.LogicLink.class);
        classes.put("LogicDisplay", sidus-victor.world.blocks.logic.LogicDisplay.class);
        classes.put("GraphicsType", sidus-victor.world.blocks.logic.LogicDisplay.GraphicsType.class);
        classes.put("LogicDisplayBuild", sidus-victor.world.blocks.logic.LogicDisplay.LogicDisplayBuild.class);
        classes.put("MemoryBlock", sidus-victor.world.blocks.logic.MemoryBlock.class);
        classes.put("MemoryBuild", sidus-victor.world.blocks.logic.MemoryBlock.MemoryBuild.class);
        classes.put("MessageBlock", sidus-victor.world.blocks.logic.MessageBlock.class);
        classes.put("MessageBuild", sidus-victor.world.blocks.logic.MessageBlock.MessageBuild.class);
        classes.put("SwitchBlock", sidus-victor.world.blocks.logic.SwitchBlock.class);
        classes.put("SwitchBuild", sidus-victor.world.blocks.logic.SwitchBlock.SwitchBuild.class);
        classes.put("BallisticSilo", sidus-victor.world.blocks.payloads.BallisticSilo.class);
        classes.put("BallisticSiloBuild", sidus-victor.world.blocks.payloads.BallisticSilo.BallisticSiloBuild.class);
        classes.put("BlockProducer", sidus-victor.world.blocks.payloads.BlockProducer.class);
        classes.put("BlockProducerBuild", sidus-victor.world.blocks.payloads.BlockProducer.BlockProducerBuild.class);
        classes.put("BuildPayload", sidus-victor.world.blocks.payloads.BuildPayload.class);
        classes.put("Constructor", sidus-victor.world.blocks.payloads.Constructor.class);
        classes.put("ConstructorBuild", sidus-victor.world.blocks.payloads.Constructor.ConstructorBuild.class);
        classes.put("NuclearWarhead", sidus-victor.world.blocks.payloads.NuclearWarhead.class);
        classes.put("NuclearWarheadBuild", sidus-victor.world.blocks.payloads.NuclearWarhead.NuclearWarheadBuild.class);
        classes.put("Payload", sidus-victor.world.blocks.payloads.Payload.class);
        classes.put("PayloadBlock", sidus-victor.world.blocks.payloads.PayloadBlock.class);
        classes.put("PayloadBlockBuild", sidus-victor.world.blocks.payloads.PayloadBlock.PayloadBlockBuild.class);
        classes.put("PayloadDeconstructor", sidus-victor.world.blocks.payloads.PayloadDeconstructor.class);
        classes.put("PayloadDeconstructorBuild", sidus-victor.world.blocks.payloads.PayloadDeconstructor.PayloadDeconstructorBuild.class);
        classes.put("PayloadLoader", sidus-victor.world.blocks.payloads.PayloadLoader.class);
        classes.put("PayloadLoaderBuild", sidus-victor.world.blocks.payloads.PayloadLoader.PayloadLoaderBuild.class);
        classes.put("PayloadMassDriver", sidus-victor.world.blocks.payloads.PayloadMassDriver.class);
        classes.put("PayloadDriverBuild", sidus-victor.world.blocks.payloads.PayloadMassDriver.PayloadDriverBuild.class);
        classes.put("PayloadDriverState", sidus-victor.world.blocks.payloads.PayloadMassDriver.PayloadDriverState.class);
        classes.put("PayloadMassDriverData", sidus-victor.world.blocks.payloads.PayloadMassDriver.PayloadMassDriverData.class);
        classes.put("PayloadSource", sidus-victor.world.blocks.payloads.PayloadSource.class);
        classes.put("PayloadSourceBuild", sidus-victor.world.blocks.payloads.PayloadSource.PayloadSourceBuild.class);
        classes.put("PayloadUnloader", sidus-victor.world.blocks.payloads.PayloadUnloader.class);
        classes.put("PayloadUnloaderBuild", sidus-victor.world.blocks.payloads.PayloadUnloader.PayloadUnloaderBuild.class);
        classes.put("PayloadVoid", sidus-victor.world.blocks.payloads.PayloadVoid.class);
        classes.put("PayloadVoidBuild", sidus-victor.world.blocks.payloads.PayloadVoid.PayloadVoidBuild.class);
        classes.put("UnitPayload", sidus-victor.world.blocks.payloads.UnitPayload.class);
        classes.put("Battery", sidus-victor.world.blocks.power.Battery.class);
        classes.put("BatteryBuild", sidus-victor.world.blocks.power.Battery.BatteryBuild.class);
        classes.put("BurnerGenerator", sidus-victor.world.blocks.power.BurnerGenerator.class);
        classes.put("BurnerGeneratorBuild", sidus-victor.world.blocks.power.BurnerGenerator.BurnerGeneratorBuild.class);
        classes.put("ConditionalConsumePower", sidus-victor.world.blocks.power.ConditionalConsumePower.class);
        classes.put("DecayGenerator", sidus-victor.world.blocks.power.DecayGenerator.class);
        classes.put("DynamicConsumePower", sidus-victor.world.blocks.power.DynamicConsumePower.class);
        classes.put("ImpactReactor", sidus-victor.world.blocks.power.ImpactReactor.class);
        classes.put("ImpactReactorBuild", sidus-victor.world.blocks.power.ImpactReactor.ImpactReactorBuild.class);
        classes.put("ItemLiquidGenerator", sidus-victor.world.blocks.power.ItemLiquidGenerator.class);
        classes.put("ItemLiquidGeneratorBuild", sidus-victor.world.blocks.power.ItemLiquidGenerator.ItemLiquidGeneratorBuild.class);
        classes.put("LightBlock", sidus-victor.world.blocks.power.LightBlock.class);
        classes.put("LightBuild", sidus-victor.world.blocks.power.LightBlock.LightBuild.class);
        classes.put("NuclearReactor", sidus-victor.world.blocks.power.NuclearReactor.class);
        classes.put("NuclearReactorBuild", sidus-victor.world.blocks.power.NuclearReactor.NuclearReactorBuild.class);
        classes.put("PowerBlock", sidus-victor.world.blocks.power.PowerBlock.class);
        classes.put("PowerDiode", sidus-victor.world.blocks.power.PowerDiode.class);
        classes.put("PowerDiodeBuild", sidus-victor.world.blocks.power.PowerDiode.PowerDiodeBuild.class);
        classes.put("PowerDistributor", sidus-victor.world.blocks.power.PowerDistributor.class);
        classes.put("PowerGenerator", sidus-victor.world.blocks.power.PowerGenerator.class);
        classes.put("GeneratorBuild", sidus-victor.world.blocks.power.PowerGenerator.GeneratorBuild.class);
        classes.put("PowerGraph", sidus-victor.world.blocks.power.PowerGraph.class);
        classes.put("PowerNode", sidus-victor.world.blocks.power.PowerNode.class);
        classes.put("PowerNodeBuild", sidus-victor.world.blocks.power.PowerNode.PowerNodeBuild.class);
        classes.put("SingleTypeGenerator", sidus-victor.world.blocks.power.SingleTypeGenerator.class);
        classes.put("SolarGenerator", sidus-victor.world.blocks.power.SolarGenerator.class);
        classes.put("SolarGeneratorBuild", sidus-victor.world.blocks.power.SolarGenerator.SolarGeneratorBuild.class);
        classes.put("ThermalGenerator", sidus-victor.world.blocks.power.ThermalGenerator.class);
        classes.put("ThermalGeneratorBuild", sidus-victor.world.blocks.power.ThermalGenerator.ThermalGeneratorBuild.class);
        classes.put("AttributeCrafter", sidus-victor.world.blocks.production.AttributeCrafter.class);
        classes.put("AttributeCrafterBuild", sidus-victor.world.blocks.production.AttributeCrafter.AttributeCrafterBuild.class);
        classes.put("AttributeSmelter", sidus-victor.world.blocks.production.AttributeSmelter.class);
        classes.put("AttributeSmelterBuild", sidus-victor.world.blocks.production.AttributeSmelter.AttributeSmelterBuild.class);
        classes.put("BeamDrill", sidus-victor.world.blocks.production.BeamDrill.class);
        classes.put("BeamDrillBuild", sidus-victor.world.blocks.production.BeamDrill.BeamDrillBuild.class);
        classes.put("Cultivator", sidus-victor.world.blocks.production.Cultivator.class);
        classes.put("CultivatorBuild", sidus-victor.world.blocks.production.Cultivator.CultivatorBuild.class);
        classes.put("Drill", sidus-victor.world.blocks.production.Drill.class);
        classes.put("DrillBuild", sidus-victor.world.blocks.production.Drill.DrillBuild.class);
        classes.put("Fracker", sidus-victor.world.blocks.production.Fracker.class);
        classes.put("FrackerBuild", sidus-victor.world.blocks.production.Fracker.FrackerBuild.class);
        classes.put("GenericCrafter", sidus-victor.world.blocks.production.GenericCrafter.class);
        classes.put("GenericCrafterBuild", sidus-victor.world.blocks.production.GenericCrafter.GenericCrafterBuild.class);
        classes.put("GenericSmelter", sidus-victor.world.blocks.production.GenericSmelter.class);
        classes.put("SmelterBuild", sidus-victor.world.blocks.production.GenericSmelter.SmelterBuild.class);
        classes.put("Incinerator", sidus-victor.world.blocks.production.Incinerator.class);
        classes.put("IncineratorBuild", sidus-victor.world.blocks.production.Incinerator.IncineratorBuild.class);
        classes.put("LiquidConverter", sidus-victor.world.blocks.production.LiquidConverter.class);
        classes.put("LiquidConverterBuild", sidus-victor.world.blocks.production.LiquidConverter.LiquidConverterBuild.class);
        classes.put("PayloadAcceptor", sidus-victor.world.blocks.production.PayloadAcceptor.class);
        classes.put("PayloadAcceptorBuild", sidus-victor.world.blocks.production.PayloadAcceptor.PayloadAcceptorBuild.class);
        classes.put("Pump", sidus-victor.world.blocks.production.Pump.class);
        classes.put("PumpBuild", sidus-victor.world.blocks.production.Pump.PumpBuild.class);
        classes.put("Separator", sidus-victor.world.blocks.production.Separator.class);
        classes.put("SeparatorBuild", sidus-victor.world.blocks.production.Separator.SeparatorBuild.class);
        classes.put("SingleBlockProducer", sidus-victor.world.blocks.production.SingleBlockProducer.class);
        classes.put("SingleBlockProducerBuild", sidus-victor.world.blocks.production.SingleBlockProducer.SingleBlockProducerBuild.class);
        classes.put("SolidPump", sidus-victor.world.blocks.production.SolidPump.class);
        classes.put("SolidPumpBuild", sidus-victor.world.blocks.production.SolidPump.SolidPumpBuild.class);
        classes.put("ItemSource", sidus-victor.world.blocks.sandbox.ItemSource.class);
        classes.put("ItemSourceBuild", sidus-victor.world.blocks.sandbox.ItemSource.ItemSourceBuild.class);
        classes.put("ItemVoid", sidus-victor.world.blocks.sandbox.ItemVoid.class);
        classes.put("ItemVoidBuild", sidus-victor.world.blocks.sandbox.ItemVoid.ItemVoidBuild.class);
        classes.put("LiquidSource", sidus-victor.world.blocks.sandbox.LiquidSource.class);
        classes.put("LiquidSourceBuild", sidus-victor.world.blocks.sandbox.LiquidSource.LiquidSourceBuild.class);
        classes.put("LiquidVoid", sidus-victor.world.blocks.sandbox.LiquidVoid.class);
        classes.put("LiquidVoidBuild", sidus-victor.world.blocks.sandbox.LiquidVoid.LiquidVoidBuild.class);
        classes.put("PowerSource", sidus-victor.world.blocks.sandbox.PowerSource.class);
        classes.put("PowerSourceBuild", sidus-victor.world.blocks.sandbox.PowerSource.PowerSourceBuild.class);
        classes.put("PowerVoid", sidus-victor.world.blocks.sandbox.PowerVoid.class);
        classes.put("CoreBlock", sidus-victor.world.blocks.storage.CoreBlock.class);
        classes.put("CoreBuild", sidus-victor.world.blocks.storage.CoreBlock.CoreBuild.class);
        classes.put("StorageBlock", sidus-victor.world.blocks.storage.StorageBlock.class);
        classes.put("StorageBuild", sidus-victor.world.blocks.storage.StorageBlock.StorageBuild.class);
        classes.put("Unloader", sidus-victor.world.blocks.storage.Unloader.class);
        classes.put("UnloaderBuild", sidus-victor.world.blocks.storage.Unloader.UnloaderBuild.class);
        classes.put("CommandCenter", sidus-victor.world.blocks.units.CommandCenter.class);
        classes.put("CommandBuild", sidus-victor.world.blocks.units.CommandCenter.CommandBuild.class);
        classes.put("Reconstructor", sidus-victor.world.blocks.units.Reconstructor.class);
        classes.put("ReconstructorBuild", sidus-victor.world.blocks.units.Reconstructor.ReconstructorBuild.class);
        classes.put("RepairPoint", sidus-victor.world.blocks.units.RepairPoint.class);
        classes.put("RepairPointBuild", sidus-victor.world.blocks.units.RepairPoint.RepairPointBuild.class);
        classes.put("UnitBlock", sidus-victor.world.blocks.units.UnitBlock.class);
        classes.put("UnitBuild", sidus-victor.world.blocks.units.UnitBlock.UnitBuild.class);
        classes.put("UnitFactory", sidus-victor.world.blocks.units.UnitFactory.class);
        classes.put("UnitFactoryBuild", sidus-victor.world.blocks.units.UnitFactory.UnitFactoryBuild.class);
        classes.put("UnitPlan", sidus-victor.world.blocks.units.UnitFactory.UnitPlan.class);
        classes.put("DrawAnimation", sidus-victor.world.draw.DrawAnimation.class);
        classes.put("DrawArcSmelter", sidus-victor.world.draw.DrawArcSmelter.class);
        classes.put("DrawBlock", sidus-victor.world.draw.DrawBlock.class);
        classes.put("DrawCells", sidus-victor.world.draw.DrawCells.class);
        classes.put("DrawCultivator", sidus-victor.world.draw.DrawCultivator.class);
        classes.put("DrawGlow", sidus-victor.world.draw.DrawGlow.class);
        classes.put("DrawLiquid", sidus-victor.world.draw.DrawLiquid.class);
        classes.put("DrawMixer", sidus-victor.world.draw.DrawMixer.class);
        classes.put("DrawRotator", sidus-victor.world.draw.DrawRotator.class);
        classes.put("DrawSmelter", sidus-victor.world.draw.DrawSmelter.class);
        classes.put("DrawWeave", sidus-victor.world.draw.DrawWeave.class);
        classes.put("Block", sidus-victor.world.Block.class);
    }
}
