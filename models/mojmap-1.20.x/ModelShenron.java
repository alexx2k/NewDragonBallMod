// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelShenron<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "shenron"), "main");
	private final ModelPart body;
	private final ModelPart head;

	public ModelShenron(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(-28.0F, -169.308F, -128.0F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.0F, 186.0F, 95.0F, 0.3054F, -0.7854F, 0.0F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -13.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -7.0F, 9.0F, -0.6545F, 2.7489F, 0.0F));

		PartDefinition body_r3 = body.addOrReplaceChild("body_r3",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -13.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -24.0F, 37.0F, -0.5236F, -2.8798F, 0.0F));

		PartDefinition body_r4 = body.addOrReplaceChild("body_r4",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(23.0F, -39.0F, 71.0F, -0.2618F, -2.5744F, 0.0F));

		PartDefinition body_r5 = body.addOrReplaceChild("body_r5",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(47.0F, -44.0F, 91.0F, -0.0873F, -2.2253F, 0.0F));

		PartDefinition body_r6 = body.addOrReplaceChild("body_r6",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.0F, 25.0F, 95.0F, 0.3054F, -0.7854F, 0.0F));

		PartDefinition body_r7 = body.addOrReplaceChild("body_r7",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 15.0F, 116.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition body_r8 = body.addOrReplaceChild("body_r8",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 5.0F, 144.0F, 0.3054F, 0.7854F, 0.0F));

		PartDefinition body_r9 = body.addOrReplaceChild("body_r9",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.0F, -5.0F, 162.0F, 0.3054F, 1.5708F, 0.0F));

		PartDefinition body_r10 = body.addOrReplaceChild("body_r10",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(46.0F, -15.0F, 160.0F, 0.3054F, 2.3562F, 0.0F));

		PartDefinition body_r11 = body.addOrReplaceChild("body_r11",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(64.0F, -25.0F, 139.0F, 0.3054F, 3.1416F, 0.0F));

		PartDefinition body_r12 = body.addOrReplaceChild("body_r12",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(61.0F, -35.0F, 111.0F, 0.3054F, -2.618F, 0.0F));

		PartDefinition body_r13 = body.addOrReplaceChild("body_r13",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(61.0F, 46.0F, 111.0F, 0.3054F, -2.3562F, 0.0F));

		PartDefinition body_r14 = body.addOrReplaceChild("body_r14",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(64.0F, 56.0F, 139.0F, 0.3054F, 3.1416F, 0.0F));

		PartDefinition body_r15 = body.addOrReplaceChild("body_r15",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(46.0F, 66.0F, 160.0F, 0.3054F, 2.3562F, 0.0F));

		PartDefinition body_r16 = body.addOrReplaceChild("body_r16",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.0F, 76.0F, 162.0F, 0.3054F, 1.5708F, 0.0F));

		PartDefinition body_r17 = body.addOrReplaceChild("body_r17",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 86.0F, 144.0F, 0.3054F, 0.7854F, 0.0F));

		PartDefinition body_r18 = body.addOrReplaceChild("body_r18",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 96.0F, 116.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition body_r19 = body.addOrReplaceChild("body_r19",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.0F, 106.0F, 95.0F, 0.3054F, -0.7854F, 0.0F));

		PartDefinition body_r20 = body.addOrReplaceChild("body_r20",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(40.0F, 36.0F, 94.0F, 0.3054F, -1.5708F, 0.0F));

		PartDefinition body_r21 = body.addOrReplaceChild("body_r21",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(40.0F, 116.0F, 94.0F, 0.3054F, -1.5708F, 0.0F));

		PartDefinition body_r22 = body.addOrReplaceChild("body_r22",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(61.0F, 126.0F, 111.0F, 0.3054F, -2.3562F, 0.0F));

		PartDefinition body_r23 = body.addOrReplaceChild("body_r23",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(64.0F, 136.0F, 139.0F, 0.3054F, 3.1416F, 0.0F));

		PartDefinition body_r24 = body.addOrReplaceChild("body_r24",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(46.0F, 146.0F, 160.0F, 0.3054F, 2.3562F, 0.0F));

		PartDefinition body_r25 = body.addOrReplaceChild("body_r25",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.0F, 156.0F, 162.0F, 0.3054F, 1.5708F, 0.0F));

		PartDefinition body_r26 = body.addOrReplaceChild("body_r26",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 166.0F, 144.0F, 0.3054F, 0.7854F, 0.0F));

		PartDefinition body_r27 = body.addOrReplaceChild("body_r27",
				CubeListBuilder.create().texOffs(0, 64).addBox(-15.0F, -16.0F, -1.0F, 16.0F, 16.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 176.0F, 116.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-18.0F, -9.0F, -1.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -9.0F, -1.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -176.789F, -154.173F, 0.1155F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 2).addBox(-3.0F, -8.0F, -1.0F, 4.0F, 6.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0472F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 2).addBox(-3.0F, -8.0F, -1.0F, 4.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0472F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -8.0F, -1.0F, 4.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0472F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -8.0F, -1.0F, 4.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0472F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-19.0F, -20.0F, -13.0F, 20.0F, 20.0F, 44.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.0F, 19.0F, 17.0F, -0.5672F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}