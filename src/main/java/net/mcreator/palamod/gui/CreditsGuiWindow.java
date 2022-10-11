
package net.mcreator.palamod.gui;

import net.mcreator.palamod.PalaModMod;

@OnlyIn(Dist.CLIENT)
public class CreditsGuiWindow extends ContainerScreen<CreditsGui.GuiContainerMod> {

	private World world;
	private int x, y, z;
	private PlayerEntity entity;

	private final static HashMap guistate = CreditsGui.guistate;

	public CreditsGuiWindow(CreditsGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("pala_mod:textures/screens/credits.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);

	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Credits :", 64, 8, -65536);
		this.font.drawString(ms, "Coowner : Tenoste", 19, 27, -39424);
		this.font.drawString(ms, "Designer : Tenoste", 19, 40, -39424);
		this.font.drawString(ms, "Owner : Queize", 19, 53, -13369600);
		this.font.drawString(ms, "Programmer : Tenoste and wQueize", 2, 70, -3342592);
		this.font.drawString(ms, "Minecraft : Mojang @a", 62, 145, -10066330);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);

	}

}
