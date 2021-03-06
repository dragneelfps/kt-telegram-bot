package com.elbekD.bot.types

data class Sticker(val file_id: String,
                   val file_unique_id: String,
                   val width: Int,
                   val height: Int,
                   val is_animated: Boolean,
                   val thumb: PhotoSize?,
                   val emoji: String?,
                   val set_name: String?,
                   val mask_position: MaskPosition?,
                   val file_size: Int)

data class StickerSet(val name: String,
                      val title: String,
                      val is_animated: Boolean,
                      val contains_mask: Boolean,
                      val stickers: List<Sticker>)

data class MaskPosition(val point: String,
                        val x_shift: Float,
                        val y_shift: Float,
                        val scale: Float)