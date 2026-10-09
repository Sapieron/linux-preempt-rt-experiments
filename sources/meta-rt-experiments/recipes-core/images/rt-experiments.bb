SUMMARY = "Real-Time Experiments image"

IMAGE_INSTALL = " \
    ${CORE_IMAGE_EXTRA_INSTALL} \
"

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_EXTRA_SPACE:append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "", d)}"
IMAGE_FSTYPES:append = " \
    cpio.gz.u-boot \
"
